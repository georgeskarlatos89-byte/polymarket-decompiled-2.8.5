package bo.app;

import defpackage.b69;
import defpackage.hdi;
import defpackage.ix2;
import defpackage.j1l;
import defpackage.lnf;
import defpackage.pm1;
import defpackage.pwg;
import defpackage.r18;
import defpackage.sv6;
import defpackage.tj6;
import defpackage.w0l;
import defpackage.w63;
import defpackage.woa;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tf {
    public String A;
    public Long B;
    public long C;
    public long D;
    public long E;
    public Map F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public long a;
    public Set b;
    public Set c;
    public Set d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public long p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public long v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public tf(JSONObject jSONObject) {
        this();
        this.a = jSONObject.optLong("time", 0L);
        this.k = jSONObject.optLong("messaging_session_timeout", -1L);
        this.J = jSONObject.optInt("minimum_session_timeout", -1);
        this.b = a(jSONObject, "events_blacklist");
        this.c = a(jSONObject, "attributes_blacklist");
        this.d = a(jSONObject, "purchases_blacklist");
        b(jSONObject);
        f(jSONObject);
        d(jSONObject);
        e(jSONObject);
        i(jSONObject);
        h(jSONObject);
        c(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("request_backoff");
        if (optJSONObject != null) {
            this.w = optJSONObject.optInt("min_sleep_duration_ms", this.w);
            this.x = optJSONObject.optInt("max_sleep_duration_ms", this.x);
            this.y = optJSONObject.optInt("scale_factor", this.y);
        }
        j(jSONObject);
        a(jSONObject);
    }

    public static HashSet a(JSONObject jSONObject, String str) {
        Iterator tj6Var;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                tj6Var = CollectionsKt.emptyList().iterator();
            } else {
                tj6Var = new tj6(pwg.n(new r18(CollectionsKt.r(lnf.k(0, optJSONArray.length())), true, new rf(optJSONArray)), new sf(optJSONArray)));
            }
            while (tj6Var.hasNext()) {
                hashSet.add((String) tj6Var.next());
            }
        }
        return hashSet;
    }

    public static final String k(JSONObject jSONObject) {
        return r0.a("sdkDebuggerObject contains invalid values. Disabling SDK debugging. ", jSONObject);
    }

    public final void b(JSONObject jSONObject) {
        tf tfVar;
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
                tfVar = this;
            } catch (JSONException e) {
                tfVar = this;
                b69.h(tfVar, pm1.E, e, false, new w0l(23), 4);
                z = false;
            }
            tfVar.j = z;
        }
    }

    public final void c(JSONObject jSONObject) {
        tf tfVar;
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("dust");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
                tfVar = this;
            } catch (JSONException e) {
                tfVar = this;
                b69.h(tfVar, pm1.E, e, false, new w0l(17), 4);
                z = false;
            }
            tfVar.t = z;
            tfVar.u = optJSONObject.optBoolean("should_block_cc_refresh", false);
        }
    }

    public final void d(JSONObject jSONObject) {
        tf tfVar;
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
                tfVar = this;
            } catch (JSONException e) {
                tfVar = this;
                b69.h(tfVar, pm1.E, e, false, new w0l(16), 4);
                z = false;
            }
            tfVar.l = z;
        }
    }

    public final void e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("feature_flags");
        if (optJSONObject != null) {
            try {
                this.m = optJSONObject.optBoolean("enabled");
                this.n = optJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e) {
                b69.h(this, pm1.E, e, false, new w0l(18), 4);
                this.m = false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj;
        if (this.a == tfVar.a && Intrinsics.areEqual(this.b, tfVar.b) && Intrinsics.areEqual(this.c, tfVar.c) && Intrinsics.areEqual(this.d, tfVar.d) && this.e == tfVar.e && this.f == tfVar.f && this.g == tfVar.g && this.h == tfVar.h && this.i == tfVar.i && this.j == tfVar.j && this.k == tfVar.k && this.l == tfVar.l && this.m == tfVar.m && this.n == tfVar.n && this.o == tfVar.o && this.p == tfVar.p && this.q == tfVar.q && this.r == tfVar.r && this.s == tfVar.s && this.t == tfVar.t && this.u == tfVar.u && this.v == tfVar.v && this.w == tfVar.w && this.x == tfVar.x && this.y == tfVar.y && this.z == tfVar.z && Intrinsics.areEqual(this.A, tfVar.A) && Intrinsics.areEqual(this.B, tfVar.B) && this.C == tfVar.C && this.D == tfVar.D && this.E == tfVar.E && Intrinsics.areEqual(this.F, tfVar.F) && this.G == tfVar.G && this.H == tfVar.H && this.I == tfVar.I && this.J == tfVar.J) {
            return true;
        }
        return false;
    }

    public final void f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.e = optJSONObject.getInt("min_time_since_last_request");
                this.f = optJSONObject.getInt("min_time_since_last_report");
                this.i = optJSONObject.getBoolean("enabled");
                this.h = true;
                this.g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e) {
                b69.h(this, pm1.E, e, false, new w0l(19), 4);
                this.e = -1;
                this.f = -1;
                this.g = -1;
                this.i = false;
                this.h = false;
            }
        }
    }

    public final void g(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("endpoint_overrides");
        if (optJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = optJSONObject.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                w9 w9Var = x9.b;
                next.getClass();
                w9Var.getClass();
                x9 x9Var = (x9) x9.c.get(next);
                if (x9Var != null) {
                    JSONObject jSONObject2 = optJSONObject.getJSONObject(next);
                    int i = jSONObject2.getInt("capacity");
                    int i2 = jSONObject2.getInt("refill_rate");
                    if (i > 0 && i2 > 0) {
                        linkedHashMap.put(x9Var, new qf(i, i2));
                    }
                }
            }
            if (!linkedHashMap.isEmpty()) {
                this.F = linkedHashMap;
            }
        }
    }

    public final void h(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
            if (optJSONObject != null) {
                if (!optJSONObject.getBoolean("enabled")) {
                    this.q = false;
                    return;
                }
                int i = optJSONObject.getInt("refill_rate");
                int i2 = optJSONObject.getInt("capacity");
                if (i2 < 10) {
                    this.q = false;
                } else if (i > 0) {
                    this.q = true;
                    this.s = i2;
                    this.r = i;
                    g(optJSONObject);
                }
            }
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new w0l(15), 4);
            this.q = false;
            this.F = null;
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = Long.hashCode(this.a) * 31;
        Set set = this.b;
        int i = 0;
        if (set == null) {
            hashCode = 0;
        } else {
            hashCode = set.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        Set set2 = this.c;
        if (set2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = set2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Set set3 = this.d;
        if (set3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = set3.hashCode();
        }
        int g = hdi.g(woa.b(this.y, woa.b(this.x, woa.b(this.w, woa.d(hdi.g(hdi.g(woa.b(this.s, woa.b(this.r, hdi.g(woa.d(hdi.g(woa.b(this.n, hdi.g(hdi.g(woa.d(hdi.g(hdi.g(hdi.g(woa.b(this.g, woa.b(this.f, woa.b(this.e, (i3 + hashCode3) * 31, 31), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31, this.o), 31, this.p), 31, this.q), 31), 31), 31, this.t), 31, this.u), 31, this.v), 31), 31), 31), 31, this.z);
        String str = this.A;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i4 = (g + hashCode4) * 31;
        Long l = this.B;
        if (l == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l.hashCode();
        }
        int d = woa.d(woa.d(woa.d((i4 + hashCode5) * 31, 31, this.C), 31, this.D), 31, this.E);
        Map map = this.F;
        if (map != null) {
            i = map.hashCode();
        }
        return Integer.hashCode(this.J) + woa.b(this.I, woa.b(this.H, hdi.g((d + i) * 31, 31, this.G), 31), 31);
    }

    public final void i(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("push_max");
        if (optJSONObject != null) {
            try {
                this.o = optJSONObject.optBoolean("enabled");
                this.p = optJSONObject.optLong("redeliver_buffer", 86400L);
                this.v = optJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e) {
                b69.h(this, pm1.E, e, false, new w0l(21), 4);
                this.o = false;
                this.p = 0L;
                this.v = -1L;
            }
        }
    }

    public final void j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("sdk_debugger");
        if (optJSONObject != null) {
            try {
                ue a = ye.k.a(optJSONObject, false);
                if (a.a) {
                    this.z = true;
                    this.A = a.c;
                    Long l = a.b;
                    if (l != null) {
                        this.B = Long.valueOf(l.longValue());
                    }
                    this.C = a.d;
                    this.D = a.e;
                    this.E = a.f;
                }
                String str = this.A;
                if (str != null && !StringsKt.T(str) && this.C > 0 && this.D > 0 && this.E > 0) {
                    return;
                }
                b69.h(this, null, null, false, new w63(optJSONObject, 24), 7);
            } catch (JSONException e) {
                b69.h(this, pm1.E, e, false, new w0l(20), 4);
            }
            this.z = false;
            this.A = null;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerConfig(configTime=");
        sb.append(this.a);
        sb.append(", blocklistedEvents=");
        sb.append(this.b);
        sb.append(", blocklistedAttributes=");
        sb.append(this.c);
        sb.append(", blocklistedPurchases=");
        sb.append(this.d);
        sb.append(", minTimeSinceLastRequest=");
        sb.append(this.e);
        sb.append(", minTimeSinceLastReport=");
        sb.append(this.f);
        sb.append(", maxNumToRegister=");
        sb.append(this.g);
        sb.append(", geofencesEnabledSet=");
        sb.append(this.h);
        sb.append(", geofencesEnabled=");
        sb.append(this.i);
        sb.append(", isContentCardsFeatureEnabled=");
        sb.append(this.j);
        sb.append(", messagingSessionTimeout=");
        sb.append(this.k);
        sb.append(", ephemeralEventsEnabled=");
        sb.append(this.l);
        sb.append(", featureFlagsEnabled=");
        sb.append(this.m);
        sb.append(", featureFlagsRefreshRateLimit=");
        sb.append(this.n);
        sb.append(", pushMaxEnabled=");
        sb.append(this.o);
        sb.append(", pushMaxRedeliverBuffer=");
        sb.append(this.p);
        sb.append(", globalRequestRateLimitEnabled=");
        sb.append(this.q);
        sb.append(", globalRequestRateLimitBucketRefillRate=");
        sb.append(this.r);
        sb.append(", globalRequestRateLimitBucketCapacity=");
        sb.append(this.s);
        sb.append(", isDustFeatureEnabled=");
        sb.append(this.t);
        sb.append(", dustShouldBlockCcRefresh=");
        sb.append(this.u);
        sb.append(", pushMaxRedeliverDedupeBuffer=");
        sb.append(this.v);
        sb.append(", defaultBackoffMinSleepMs=");
        sb.append(this.w);
        sb.append(", defaultBackoffMaxSleepMs=");
        sb.append(this.x);
        sb.append(", defaultBackoffScaleFactor=");
        sb.append(this.y);
        sb.append(", sdkDebuggerEnabled=");
        sb.append(this.z);
        sb.append(", sdkDebuggerAuthCode=");
        sb.append(this.A);
        sb.append(", sdkDebuggerExpirationTime=");
        sb.append(this.B);
        sb.append(", sdkDebuggerFlushIntervalBytes=");
        sb.append(this.C);
        sb.append(", sdkDebuggerFlushIntervalSeconds=");
        sb.append(this.D);
        sb.append(", sdkDebuggerMaxPayloadBytes=");
        sb.append(this.E);
        sb.append(", globalRequestRateLimitOverrides=");
        sb.append(this.F);
        sb.append(", bannersEnabled=");
        sb.append(this.G);
        sb.append(", maxBannerPlacements=");
        sb.append(this.H);
        sb.append(", dismissalsCacheSize=");
        sb.append(this.I);
        sb.append(", minimumSessionTimeoutSeconds=");
        return sv6.o(sb, this.J, ')');
    }

    public static final String b() {
        return "Error getting required content cards fields. Using defaults.";
    }

    public static final String d() {
        return "Error getting required ephemeral events fields. Using defaults.";
    }

    public static final String c() {
        return "Error getting required DUST enabled field. Using default of false.";
    }

    public static final String e() {
        return "Error getting required feature flag fields. Disabling feature flags.";
    }

    public static final String i() {
        return "Error getting required SDK debugging fields. Disabling SDK debugging.";
    }

    public static final String f() {
        return "Error getting required geofence fields. Using defaults.";
    }

    public static final String h() {
        return "Error getting required push max fields. Disabling push max.";
    }

    public static final String a(tf tfVar) {
        return ix2.i(tfVar.H, ". Not enabling banners.", new StringBuilder("Banners enabled but maxBannerPlacement is "));
    }

    public static final String a() {
        return "Error getting required banner configuration fields. Disabling banners.";
    }

    public final void a(JSONObject jSONObject) {
        int i;
        JSONObject optJSONObject = jSONObject.optJSONObject("banners");
        if (optJSONObject != null) {
            try {
                this.G = optJSONObject.getBoolean("enabled");
                i = optJSONObject.getInt("max_placements");
                this.H = i;
            } catch (JSONException e) {
                b69.h(this, pm1.E, e, false, new w0l(22), 4);
            }
            if (this.G && i <= 0) {
                b69.h(this, null, null, false, new j1l(this, 0), 7);
                this.G = false;
                this.H = 0;
            }
            int optInt = optJSONObject.optInt("dismissals_cache_size", 200);
            this.I = optInt > 0 ? optInt : 200;
        }
    }

    public static final String g() {
        return "Caught error parsing global rate limit config.";
    }

    public tf() {
        this.a = 0L;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = -1L;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = false;
        this.p = 86400L;
        this.q = true;
        this.r = 30;
        this.s = 30;
        this.t = false;
        this.u = false;
        this.v = -1L;
        this.w = 10000;
        this.x = 300000;
        this.y = 3;
        this.z = false;
        this.A = null;
        this.B = null;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = null;
        this.G = false;
        this.H = 0;
        this.I = 200;
        this.J = -1;
    }
}
