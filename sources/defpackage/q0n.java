package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class q0n extends z1m {
    public volatile azm c;
    public volatile azm d;
    public azm e;
    public final ConcurrentHashMap f;
    public bol g;
    public volatile boolean h;
    public volatile azm i;
    public azm j;
    public boolean k;
    public final Object l;

    public q0n(kfm kfmVar) {
        super(kfmVar);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    @Override // defpackage.z1m
    public final boolean j1() {
        return false;
    }

    public final azm k1(boolean z) {
        h1();
        g1();
        azm azmVar = this.e;
        if (!z) {
            return azmVar;
        }
        if (azmVar != null) {
            return azmVar;
        }
        return this.j;
    }

    public final String l1(String str) {
        String str2;
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        kfm kfmVar = (kfm) this.a;
        int length2 = str2.length();
        kfmVar.d.getClass();
        if (length2 > 500) {
            kfmVar.d.getClass();
            return str2.substring(0, RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE);
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(azm azmVar, azm azmVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        Bundle bundle2;
        String str;
        long j2;
        long j3;
        Bundle bundle3;
        boolean z3 = azmVar.e;
        kfm kfmVar = (kfm) this.a;
        g1();
        boolean z4 = false;
        if (azmVar2 != null) {
            if (azmVar2.c == azmVar.c && Objects.equals(azmVar2.b, azmVar.b) && Objects.equals(azmVar2.a, azmVar.a)) {
                z2 = false;
                if (z && this.e != null) {
                    z4 = true;
                }
                if (z2) {
                    if (bundle != null) {
                        bundle2 = new Bundle(bundle);
                    } else {
                        bundle2 = new Bundle();
                    }
                    uhn.c2(azmVar, bundle2, true);
                    if (azmVar2 != null) {
                        String str2 = azmVar2.a;
                        if (str2 != null) {
                            bundle2.putString("_pn", str2);
                        }
                        String str3 = azmVar2.b;
                        if (str3 != null) {
                            bundle2.putString("_pc", str3);
                        }
                        bundle2.putLong("_pi", azmVar2.c);
                    }
                    if (z4) {
                        gbn gbnVar = kfmVar.h;
                        kfm.f(gbnVar);
                        fj1 fj1Var = gbnVar.f;
                        long j4 = j - fj1Var.b;
                        fj1Var.b = j;
                        if (j4 > 0) {
                            uhn uhnVar = kfmVar.i;
                            kfm.e(uhnVar);
                            uhnVar.S1(bundle2, j4);
                        }
                    }
                    ddl ddlVar = kfmVar.d;
                    m67 m67Var = kfmVar.k;
                    if (!ddlVar.v1()) {
                        bundle2.putLong("_mst", 1L);
                    }
                    if (true != z3) {
                        str = "auto";
                    } else {
                        str = "app";
                    }
                    String str4 = str;
                    m67Var.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z3) {
                        long j5 = azmVar.f;
                        if (j5 != 0) {
                            j2 = j5;
                            if (!kfmVar.d.r1(null, s1m.e1)) {
                                j3 = SystemClock.elapsedRealtime();
                            } else {
                                j3 = 0;
                            }
                            if (!z3) {
                                bundle3 = bundle2;
                                long j6 = azmVar.g;
                                if (j6 != 0) {
                                    j3 = j6;
                                }
                            } else {
                                bundle3 = bundle2;
                            }
                            twm twmVar = kfmVar.m;
                            kfm.f(twmVar);
                            twmVar.o1(j2, j3, bundle3, str4, "_vs");
                        }
                    }
                    j2 = currentTimeMillis;
                    if (!kfmVar.d.r1(null, s1m.e1)) {
                    }
                    if (!z3) {
                    }
                    twm twmVar2 = kfmVar.m;
                    kfm.f(twmVar2);
                    twmVar2.o1(j2, j3, bundle3, str4, "_vs");
                }
                if (z4) {
                    p1(this.e, true, j);
                }
                this.e = azmVar;
                if (z3) {
                    this.j = azmVar;
                }
                d8n i = kfmVar.i();
                i.g1();
                i.h1();
                i.u1(new k3n(i, azmVar));
            }
        }
        z2 = true;
        if (z) {
            z4 = true;
        }
        if (z2) {
        }
        if (z4) {
        }
        this.e = azmVar;
        if (z3) {
        }
        d8n i2 = kfmVar.i();
        i2.g1();
        i2.h1();
        i2.u1(new k3n(i2, azmVar));
    }

    public final void n1(bol bolVar, Bundle bundle) {
        Bundle bundle2;
        if (((kfm) this.a).d.v1() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f.put(Integer.valueOf(bolVar.a), new azm(bundle2.getString(Keys.KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)));
        }
    }

    public final void o1(String str, azm azmVar, boolean z) {
        azm azmVar2;
        azm azmVar3;
        String str2;
        if (this.c == null) {
            azmVar2 = this.d;
        } else {
            azmVar2 = this.c;
        }
        azm azmVar4 = azmVar2;
        if (azmVar.b == null) {
            if (str != null) {
                str2 = l1(str);
            } else {
                str2 = null;
            }
            String str3 = str2;
            String str4 = azmVar.a;
            azmVar3 = new azm(azmVar.c, azmVar.f, azmVar.g, str4, str3, azmVar.e);
        } else {
            azmVar3 = azmVar;
        }
        this.d = this.c;
        this.c = azmVar3;
        kfm kfmVar = (kfm) this.a;
        kfmVar.k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lem lemVar = kfmVar.g;
        kfm.g(lemVar);
        lemVar.p1(new lzm(this, azmVar3, azmVar4, elapsedRealtime, z));
    }

    public final void p1(azm azmVar, boolean z, long j) {
        boolean z2;
        kfm kfmVar = (kfm) this.a;
        hnl hnlVar = kfmVar.n;
        kfm.d(hnlVar);
        kfmVar.k.getClass();
        hnlVar.j1(SystemClock.elapsedRealtime());
        if (azmVar != null && azmVar.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        gbn gbnVar = kfmVar.h;
        kfm.f(gbnVar);
        if (gbnVar.f.p(j, z2, z) && azmVar != null) {
            azmVar.d = false;
        }
    }

    public final azm q1(bol bolVar) {
        arn.h(bolVar);
        Integer valueOf = Integer.valueOf(bolVar.a);
        ConcurrentHashMap concurrentHashMap = this.f;
        azm azmVar = (azm) concurrentHashMap.get(valueOf);
        if (azmVar == null) {
            String l1 = l1(bolVar.b);
            uhn uhnVar = ((kfm) this.a).i;
            kfm.e(uhnVar);
            azm azmVar2 = new azm(null, l1, uhnVar.e2());
            concurrentHashMap.put(valueOf, azmVar2);
            azmVar = azmVar2;
        }
        if (this.i != null) {
            return this.i;
        }
        return azmVar;
    }
}
