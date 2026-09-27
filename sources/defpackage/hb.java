package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hb {
    public static final hb c = new hb(new gb[0]);
    public static final gb d;
    public final int a;
    public final gb[] b;

    static {
        gb gbVar = new gb(-1, new int[0], new j7c[0], new long[0], new String[0]);
        int[] iArr = gbVar.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = gbVar.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        d = new gb(0, copyOf, (j7c[]) Arrays.copyOf(gbVar.c, 0), copyOf2, (String[]) Arrays.copyOf(gbVar.f, 0));
        u1k.G(1);
        u1k.G(2);
        u1k.G(3);
        u1k.G(4);
    }

    public hb(gb[] gbVarArr) {
        this.a = gbVarArr.length;
        this.b = gbVarArr;
    }

    public final gb a(int i) {
        if (i < 0) {
            return d;
        }
        return this.b[i];
    }

    public final boolean b(int i) {
        if (i == this.a - 1) {
            a(i).getClass();
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hb.class == obj.getClass()) {
                hb hbVar = (hb) obj;
                if (this.a == hbVar.a && Arrays.equals(this.b, hbVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            gb[] gbVarArr = this.b;
            if (i < gbVarArr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                gbVarArr[i].getClass();
                for (int i2 = 0; i2 < gbVarArr[i].d.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = gbVarArr[i].d[i2];
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(gbVarArr[i].e[i2]);
                    sb.append(')');
                    if (i2 < gbVarArr[i].d.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < gbVarArr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
