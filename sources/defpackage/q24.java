package defpackage;

import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.j;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class q24 implements xq6, tk4 {
    public static final q24 d = new q24(3, 4, 0);
    public static final q24 e = new q24(1, 2, 0);
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public q24(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 13:
                this.b = 2;
                this.c = i;
                return;
            default:
                this.b = i;
                this.c = i;
                if (i != 0) {
                    return;
                }
                dmk.v("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
                throw null;
        }
    }

    public int a() {
        int i = this.c;
        if (i != 2) {
            if (i != 5) {
                if (i != 29) {
                    if (i != 42) {
                        if (i != 22) {
                            if (i != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    @Override // defpackage.xq6
    public LDValue k0() {
        j jVar = new j();
        jVar.f("streamingDisabled", true);
        jVar.c("backgroundPollingIntervalMillis", this.b);
        jVar.c("pollingIntervalMillis", this.c);
        return jVar.a();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("CipherMode [forEncryption=");
                sb.append(this.b);
                sb.append(", forDecryption=");
                return ix2.i(this.c, "]", sb);
            case 7:
                StringBuilder sb2 = new StringBuilder("MutableRange(start=");
                sb2.append(this.b);
                sb2.append(", end=");
                return sv6.o(sb2, this.c, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q24(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ q24(int i, byte b) {
        this.a = i;
    }
}
