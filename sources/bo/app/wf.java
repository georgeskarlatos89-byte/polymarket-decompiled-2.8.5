package bo.app;

import android.content.Context;
import defpackage.ada;
import defpackage.azk;
import defpackage.b2i;
import defpackage.b69;
import defpackage.d1c;
import defpackage.fd7;
import defpackage.fq5;
import defpackage.hdi;
import defpackage.j1l;
import defpackage.l0l;
import defpackage.mrc;
import defpackage.n1l;
import defpackage.oq5;
import defpackage.orc;
import defpackage.pm1;
import defpackage.qq5;
import defpackage.rq5;
import defpackage.sq5;
import defpackage.u0l;
import defpackage.vz5;
import defpackage.x01;
import defpackage.yca;
import defpackage.yk0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.url._UrlKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wf {
    public final m8 a;
    public final l0l b;
    public final ReentrantLock c;
    public final mrc d;
    public tf e;

    public wf(Context context, String str, m8 m8Var) {
        wf wfVar;
        context.getClass();
        this.a = m8Var;
        l0l l0lVar = new l0l(context, str);
        this.b = l0lVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = new orc();
        fq5 fq5Var = fq5.LAST_ACCESSED_SDK_VERSION;
        String readString = l0lVar.readString(fq5Var, "");
        if (!Intrinsics.areEqual("43.1.1", readString)) {
            wfVar = this;
            b69.h(wfVar, pm1.V, null, false, new u0l(readString, 12), 6);
            l0lVar.writeData(fq5.CONFIG_TIME, 0L);
            l0lVar.writeData(fq5Var, "43.1.1");
        } else {
            wfVar = this;
        }
        tf tfVar = new tf();
        tfVar.c = wfVar.e();
        tfVar.b = wfVar.f();
        tfVar.d = wfVar.g();
        tfVar.a = wfVar.i();
        tfVar.k = wfVar.s();
        tfVar.J = wfVar.v();
        tfVar.e = wfVar.u();
        tfVar.f = wfVar.t();
        tfVar.g = wfVar.r();
        tfVar.i = wfVar.L();
        tfVar.h = wfVar.M();
        tfVar.j = wfVar.H();
        tfVar.l = wfVar.J();
        tfVar.m = wfVar.K();
        tfVar.n = wfVar.n();
        tfVar.o = wfVar.O();
        tfVar.p = wfVar.w();
        tfVar.t = wfVar.I();
        tfVar.u = wfVar.G();
        tfVar.q = wfVar.N();
        tfVar.r = wfVar.p();
        tfVar.s = wfVar.o();
        tfVar.v = wfVar.x();
        tfVar.y = wfVar.l();
        tfVar.w = wfVar.k();
        tfVar.x = wfVar.j();
        tfVar.z = wfVar.P();
        tfVar.A = wfVar.B();
        tfVar.C = wfVar.D();
        tfVar.D = wfVar.E();
        tfVar.E = wfVar.F();
        tfVar.B = Long.valueOf(wfVar.C());
        tfVar.F = wfVar.A();
        tfVar.G = wfVar.d();
        tfVar.H = wfVar.q();
        tfVar.I = wfVar.m();
        reentrantLock.lock();
        try {
            wfVar.e = tfVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String R() {
        return "Attempting to unlock server config info";
    }

    public static final String S() {
        return "Unlocking config info lock.";
    }

    public static final String T() {
        return "Tried to unlock server config info when not locked.";
    }

    public static final String U() {
        return "Could not persist server config to DataStore.";
    }

    public static final String V() {
        return "Could not persist server config to DataStore.";
    }

    public static final String W() {
        return "Server config is older than previous config time. Not sending out ConfigChangeEvent.";
    }

    public static final String b(tf tfVar) {
        return "Finishing updating server config to " + tfVar;
    }

    public static final String c() {
        return "Not allowing server config info unlock. Returning null.";
    }

    public static final String h() {
        return "Experienced exception retrieving blocklisted strings from local storage. Returning empty set.";
    }

    public static final String z() {
        return "Failed to parse endpoint override from storage";
    }

    public final Map A() {
        Map y;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                y = tfVar.F;
                if (y == null) {
                }
                reentrantLock.unlock();
                return y;
            }
            y = y();
            reentrantLock.unlock();
            return y;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final String B() {
        String readString;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                readString = tfVar.A;
                if (readString == null) {
                }
                reentrantLock.unlock();
                return readString;
            }
            readString = this.b.readString(fq5.SDK_DEBUGGER_AUTHORIZATION_CODE, null);
            reentrantLock.unlock();
            return readString;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long C() {
        long j;
        long longValue;
        Long l;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null && (l = tfVar.B) != null) {
                longValue = l.longValue();
            } else {
                j = -1;
                Long readLong = this.b.readLong(fq5.SDK_DEBUGGER_EXPIRATION_TIME, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long D() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                longValue = tfVar.C;
            } else {
                j = 0;
                Long readLong = this.b.readLong(fq5.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long E() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                longValue = tfVar.D;
            } else {
                j = 0;
                Long readLong = this.b.readLong(fq5.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long F() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                longValue = tfVar.E;
            } else {
                j = 0;
                Long readLong = this.b.readLong(fq5.SDK_DEBUGGER_MAX_PAYLOAD_BYTES, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean G() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.u;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.DUST_SHOULD_BLOCK_CC_REFRESH, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean H() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.j;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.CONTENT_CARDS_ENABLED, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean I() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.t;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.DUST_ENABLED, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean J() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.l;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.EPHEMERAL_EVENTS_ENABLED, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean K() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.m;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.FEATURE_FLAGS_ENABLED, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean L() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.i;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.GEOFENCES_ENABLED, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean M() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.h;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.GEOFENCES_ENABLED_SET, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean N() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.q;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.GLOBAL_REQUEST_RATE_LIMITING_ENABLED, Boolean.TRUE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean O() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.o;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.PUSH_MAX_ENABLED, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean P() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.z;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.SDK_DEBUGGER_ENABLED, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void Q() {
        b69.h(this, pm1.V, null, false, new n1l(22), 6);
        if (this.d.g()) {
            b69.h(this, null, null, false, new n1l(23), 7);
            try {
                this.d.o(null);
            } catch (IllegalStateException e) {
                b69.h(this, pm1.E, e, false, new n1l(15), 4);
            }
        }
    }

    public final void a(tf tfVar) {
        wf wfVar;
        String str;
        String str2;
        x01 x01Var = x01.i;
        azk azkVar = azk.f;
        tfVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar2 = this.e;
            this.e = tfVar;
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set set = tfVar.b;
                String str3 = _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
                if (set != null) {
                    String b = fq5.BLOCKLISTED_EVENTS.b();
                    List M0 = CollectionsKt.M0(set);
                    try {
                        yca ycaVar = ada.d;
                        ycaVar.getClass();
                        str2 = ycaVar.c(new yk0(b2i.a, 0), M0);
                    } catch (Exception e) {
                        b69.h(azkVar, pm1.E, e, false, x01Var, 4);
                        if ((M0 instanceof Map) || !(M0 instanceof List)) {
                            str2 = "{}";
                        } else {
                            str2 = _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
                        }
                    }
                    linkedHashMap.put(b, str2);
                }
                Set set2 = tfVar.c;
                if (set2 != null) {
                    String b2 = fq5.BLOCKLISTED_ATTRIBUTES.b();
                    List M02 = CollectionsKt.M0(set2);
                    try {
                        yca ycaVar2 = ada.d;
                        ycaVar2.getClass();
                        str = ycaVar2.c(new yk0(b2i.a, 0), M02);
                    } catch (Exception e2) {
                        b69.h(azkVar, pm1.E, e2, false, x01Var, 4);
                        if ((M02 instanceof Map) || !(M02 instanceof List)) {
                            str = "{}";
                        } else {
                            str = _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
                        }
                    }
                    linkedHashMap.put(b2, str);
                }
                Set set3 = tfVar.d;
                if (set3 != null) {
                    String b3 = fq5.BLOCKLISTED_PURCHASES.b();
                    List M03 = CollectionsKt.M0(set3);
                    try {
                        yca ycaVar3 = ada.d;
                        ycaVar3.getClass();
                        str3 = ycaVar3.c(new yk0(b2i.a, 0), M03);
                    } catch (Exception e3) {
                        b69.h(azkVar, pm1.E, e3, false, x01Var, 4);
                        if ((M03 instanceof Map) || !(M03 instanceof List)) {
                            str3 = "{}";
                        }
                    }
                    linkedHashMap.put(b3, str3);
                }
                Map map = tfVar.F;
                if (map != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        x9 x9Var = (x9) entry.getKey();
                        qf qfVar = (qf) entry.getValue();
                        jSONObject.put(x9Var.name(), new JSONObject().put("refill", qfVar.b).put("capacity", qfVar.a));
                    }
                    linkedHashMap.put(fq5.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.b(), jSONObject.toString());
                }
                linkedHashMap.put(fq5.CONFIG_TIME.b(), Long.valueOf(tfVar.a));
                linkedHashMap.put(fq5.EPHEMERAL_EVENTS_ENABLED.b(), Boolean.valueOf(tfVar.l));
                linkedHashMap.put(fq5.GEOFENCES_ENABLED_SET.b(), Boolean.valueOf(tfVar.h));
                linkedHashMap.put(fq5.GEOFENCES_ENABLED.b(), Boolean.valueOf(tfVar.i));
                linkedHashMap.put(fq5.GEOFENCES_MIN_TIME_REQUEST.b(), Integer.valueOf(tfVar.e));
                linkedHashMap.put(fq5.GEOFENCES_MIN_TIME_REPORT.b(), Integer.valueOf(tfVar.f));
                linkedHashMap.put(fq5.GEOFENCES_MAX_NUM_TO_REGISTER.b(), Integer.valueOf(tfVar.g));
                linkedHashMap.put(fq5.MESSAGING_SESSION_TIMEOUT.b(), Long.valueOf(tfVar.k));
                linkedHashMap.put(fq5.MINIMUM_SESSION_TIMEOUT.b(), Integer.valueOf(tfVar.J));
                linkedHashMap.put(fq5.DUST_ENABLED.b(), Boolean.valueOf(tfVar.t));
                linkedHashMap.put(fq5.DUST_SHOULD_BLOCK_CC_REFRESH.b(), Boolean.valueOf(tfVar.u));
                linkedHashMap.put(fq5.CONTENT_CARDS_ENABLED.b(), Boolean.valueOf(tfVar.j));
                linkedHashMap.put(fq5.FEATURE_FLAGS_ENABLED.b(), Boolean.valueOf(tfVar.m));
                linkedHashMap.put(fq5.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.b(), Integer.valueOf(tfVar.n));
                linkedHashMap.put(fq5.PUSH_MAX_ENABLED.b(), Boolean.valueOf(tfVar.o));
                linkedHashMap.put(fq5.PUSH_MAX_REDELIVER_BUFFER.b(), Long.valueOf(tfVar.p));
                linkedHashMap.put(fq5.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.b(), Long.valueOf(tfVar.v));
                linkedHashMap.put(fq5.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.b(), Boolean.valueOf(tfVar.q));
                linkedHashMap.put(fq5.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.b(), Integer.valueOf(tfVar.s));
                linkedHashMap.put(fq5.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.b(), Integer.valueOf(tfVar.r));
                linkedHashMap.put(fq5.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.b(), Integer.valueOf(tfVar.w));
                linkedHashMap.put(fq5.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.b(), Integer.valueOf(tfVar.x));
                linkedHashMap.put(fq5.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.b(), Integer.valueOf(tfVar.y));
                linkedHashMap.put(fq5.SDK_DEBUGGER_ENABLED.b(), Boolean.valueOf(tfVar.z));
                Long l = tfVar.B;
                if (l != null) {
                    linkedHashMap.put(fq5.SDK_DEBUGGER_EXPIRATION_TIME.b(), Long.valueOf(l.longValue()));
                }
                String str4 = tfVar.A;
                if (str4 != null) {
                    linkedHashMap.put(fq5.SDK_DEBUGGER_AUTHORIZATION_CODE.b(), str4);
                }
                linkedHashMap.put(fq5.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.b(), Long.valueOf(tfVar.C));
                linkedHashMap.put(fq5.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.b(), Long.valueOf(tfVar.D));
                linkedHashMap.put(fq5.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.b(), Long.valueOf(tfVar.E));
                linkedHashMap.put(fq5.BANNERS_ENABLED.b(), Boolean.valueOf(tfVar.G));
                linkedHashMap.put(fq5.MAX_BANNER_PLACEMENTS.b(), Integer.valueOf(tfVar.H));
                linkedHashMap.put(fq5.BANNERS_DISMISSALS_CACHE_SIZE.b(), Integer.valueOf(tfVar.I));
                this.b.batchUpdate(linkedHashMap, fd7.a);
                wfVar = this;
            } catch (Exception e4) {
                b69.h(this, pm1.E, e4, false, new n1l(14), 4);
                wfVar = this;
            }
            b69.h(wfVar, pm1.V, null, false, new j1l(tfVar, 1), 6);
            if (tfVar2 != null) {
                if (tfVar.a > tfVar2.a) {
                    wfVar.a.b(new g4(tfVar2, tfVar), g4.class);
                } else {
                    b69.h(wfVar, null, null, false, new n1l(17), 7);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean d() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                z = tfVar.G;
            } else {
                Boolean readBoolean = this.b.readBoolean(fq5.BANNERS_ENABLED, Boolean.FALSE);
                if (readBoolean != null) {
                    z = readBoolean.booleanValue();
                } else {
                    z = false;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set e() {
        Set a;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                a = tfVar.c;
                if (a == null) {
                }
                reentrantLock.unlock();
                return a;
            }
            a = a(fq5.BLOCKLISTED_ATTRIBUTES);
            reentrantLock.unlock();
            return a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set f() {
        Set a;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                a = tfVar.b;
                if (a == null) {
                }
                reentrantLock.unlock();
                return a;
            }
            a = a(fq5.BLOCKLISTED_EVENTS);
            reentrantLock.unlock();
            return a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set g() {
        Set a;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                a = tfVar.d;
                if (a == null) {
                }
                reentrantLock.unlock();
                return a;
            }
            a = a(fq5.BLOCKLISTED_PURCHASES);
            reentrantLock.unlock();
            return a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long i() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                longValue = tfVar.a;
            } else {
                j = 0;
                Long readLong = this.b.readLong(fq5.CONFIG_TIME, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int j() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.x;
            } else {
                i = 300000;
                Integer readInt = this.b.readInt(fq5.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS, 300000);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int k() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.w;
            } else {
                i = 10000;
                Integer readInt = this.b.readInt(fq5.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS, 10000);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int l() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.y;
            } else {
                i = 3;
                Integer readInt = this.b.readInt(fq5.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR, 3);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int m() {
        int i;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            int i2 = 200;
            if (tfVar != null) {
                i = tfVar.I;
            } else {
                Integer readInt = this.b.readInt(fq5.BANNERS_DISMISSALS_CACHE_SIZE, 200);
                if (readInt != null) {
                    i = readInt.intValue();
                } else {
                    i = 200;
                }
            }
            if (i > 0) {
                i2 = i;
            }
            reentrantLock.unlock();
            return i2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int n() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.n;
            } else {
                i = 5;
                Integer readInt = this.b.readInt(fq5.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT, 5);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int o() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.s;
            } else {
                i = 30;
                Integer readInt = this.b.readInt(fq5.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY, 30);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int p() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.r;
            } else {
                i = 30;
                Integer readInt = this.b.readInt(fq5.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE, 30);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int q() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.H;
            } else {
                i = 0;
                Integer readInt = this.b.readInt(fq5.MAX_BANNER_PLACEMENTS, 0);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int r() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.g;
            } else {
                i = -1;
                Integer readInt = this.b.readInt(fq5.GEOFENCES_MAX_NUM_TO_REGISTER, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long s() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                longValue = tfVar.k;
            } else {
                j = -1;
                Long readLong = this.b.readLong(fq5.MESSAGING_SESSION_TIMEOUT, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int t() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.f;
            } else {
                i = -1;
                Integer readInt = this.b.readInt(fq5.GEOFENCES_MIN_TIME_REPORT, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int u() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.e;
            } else {
                i = -1;
                Integer readInt = this.b.readInt(fq5.GEOFENCES_MIN_TIME_REQUEST, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int v() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                intValue = tfVar.J;
            } else {
                i = -1;
                Integer readInt = this.b.readInt(fq5.MINIMUM_SESSION_TIMEOUT, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long w() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                longValue = tfVar.p;
            } else {
                j = 86400;
                Long readLong = this.b.readLong(fq5.PUSH_MAX_REDELIVER_BUFFER, 86400L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long x() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                longValue = tfVar.v;
            } else {
                j = -1;
                Long readLong = this.b.readLong(fq5.PUSH_MAX_REDELIVER_DEDUPE_BUFFER, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final LinkedHashMap y() {
        String str = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String readString = this.b.readString(fq5.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES, "");
            if (readString != null) {
                str = readString;
            }
            if (str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                while (keys.hasNext()) {
                    String next = keys.next();
                    w9 w9Var = x9.b;
                    next.getClass();
                    x9 a = w9Var.a(next);
                    if (a != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        linkedHashMap.put(a, new qf(jSONObject2.getInt("capacity"), jSONObject2.getInt("refill")));
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new n1l(18), 4);
            return linkedHashMap;
        }
    }

    public static final String b() {
        return "Attempting to acquire server config lock";
    }

    public static final String a(String str, String str2) {
        return hdi.p("Detected SDK update from '", str, "' -> '", str2, "'. Clearing config update time.");
    }

    public final void a(ue ueVar) {
        wf wfVar;
        ueVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            tf tfVar = this.e;
            if (tfVar != null) {
                tfVar.z = ueVar.a;
            }
            if (tfVar != null) {
                tfVar.C = ueVar.d;
            }
            if (tfVar != null) {
                tfVar.D = ueVar.e;
            }
            if (tfVar != null) {
                tfVar.E = ueVar.f;
            }
            String str = ueVar.c;
            if (str != null && tfVar != null) {
                tfVar.A = str;
            }
            Long l = ueVar.b;
            if (l != null) {
                long longValue = l.longValue();
                tf tfVar2 = this.e;
                if (tfVar2 != null) {
                    tfVar2.B = Long.valueOf(longValue);
                }
            }
            reentrantLock.unlock();
            try {
                tf tfVar3 = this.e;
                if (tfVar3 != null) {
                    LinkedHashMap h = d1c.h(new Pair(fq5.SDK_DEBUGGER_ENABLED.b(), Boolean.valueOf(tfVar3.z)), new Pair(fq5.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.b(), Long.valueOf(tfVar3.C)), new Pair(fq5.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.b(), Long.valueOf(tfVar3.D)), new Pair(fq5.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.b(), Long.valueOf(tfVar3.E)));
                    Long l2 = tfVar3.B;
                    if (l2 != null) {
                        h.put(fq5.SDK_DEBUGGER_EXPIRATION_TIME.b(), Long.valueOf(l2.longValue()));
                    }
                    String str2 = tfVar3.A;
                    if (str2 != null) {
                        h.put(fq5.SDK_DEBUGGER_AUTHORIZATION_CODE.b(), str2);
                    }
                    this.b.batchUpdate(h, fd7.a);
                }
                wfVar = this;
            } catch (Exception e) {
                wfVar = this;
                b69.h(wfVar, pm1.E, e, false, new n1l(16), 4);
            }
            b69.h(wfVar, pm1.V, null, false, new vz5(wfVar, 1), 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(wf wfVar) {
        return "Finishing updating server config to " + wfVar.e;
    }

    public final Pair a() {
        pm1 pm1Var = pm1.V;
        b69.h(this, pm1Var, null, false, new n1l(20), 6);
        if (!this.d.tryLock()) {
            b69.h(this, pm1Var, null, false, new n1l(21), 6);
            return null;
        }
        return new Pair(Long.valueOf(i()), Boolean.valueOf(i() <= 0));
    }

    public final HashSet a(fq5 fq5Var) {
        ArrayList arrayList;
        List emptyList;
        try {
            l0l l0lVar = this.b;
            if (fq5Var.c() != sq5.LIST) {
                qq5.Companion.getClass();
                b69.o(qq5.access$getTAG$cp(), pm1.E, null, false, new oq5(fq5Var, 0), 12);
                arrayList = new ArrayList();
            } else {
                try {
                    Object readData = l0lVar.readData(fq5Var, "");
                    readData.getClass();
                    String str = (String) readData;
                    if (StringsKt.T(str)) {
                        arrayList = new ArrayList();
                    } else {
                        azk azkVar = azk.f;
                        if (StringsKt.T(str)) {
                            emptyList = CollectionsKt.emptyList();
                        } else if (Intrinsics.areEqual(StringsKt.s0(str).toString(), "null")) {
                            emptyList = CollectionsKt.emptyList();
                        } else {
                            try {
                                yca ycaVar = ada.d;
                                ycaVar.getClass();
                                emptyList = (List) ycaVar.b(str, new yk0(b2i.a, 0));
                            } catch (Exception e) {
                                b69.h(azkVar, pm1.E, e, false, new rq5(str, 0), 4);
                                emptyList = CollectionsKt.emptyList();
                            }
                        }
                        arrayList = CollectionsKt.O0(emptyList);
                    }
                } catch (Exception e2) {
                    qq5.Companion.getClass();
                    b69.o(qq5.access$getTAG$cp(), pm1.E, e2, false, new oq5(fq5Var, 1), 8);
                    arrayList = new ArrayList();
                }
            }
            return CollectionsKt.K0(arrayList);
        } catch (Exception e3) {
            b69.h(this, pm1.E, e3, false, new n1l(19), 4);
            return new HashSet();
        }
    }
}
