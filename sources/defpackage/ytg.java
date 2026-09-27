package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ytg implements pug, Iterable, xja {
    public final iqc a = eig.b();
    public x0c b;
    public boolean c;
    public boolean d;

    @Override // defpackage.pug
    public final void a(oug ougVar, Object obj) {
        boolean z = obj instanceof k6;
        iqc iqcVar = this.a;
        if (z && iqcVar.b(ougVar)) {
            Object d = iqcVar.d(ougVar);
            d.getClass();
            k6 k6Var = (k6) d;
            k6 k6Var2 = (k6) obj;
            String str = k6Var2.a;
            if (str == null) {
                str = k6Var.a;
            }
            qp8 qp8Var = k6Var2.b;
            if (qp8Var == null) {
                qp8Var = k6Var.b;
            }
            iqcVar.m(ougVar, new k6(str, qp8Var));
        } else {
            iqcVar.m(ougVar, obj);
        }
        ougVar.getClass();
    }

    public final ytg b() {
        ytg ytgVar = new ytg();
        ytgVar.c = this.c;
        ytgVar.d = this.d;
        iqc iqcVar = this.a;
        Object[] objArr = iqcVar.b;
        Object[] objArr2 = iqcVar.c;
        long[] jArr = iqcVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            ytgVar.a.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return ytgVar;
    }

    public final Object c(oug ougVar) {
        Object d = this.a.d(ougVar);
        if (d != null) {
            return d;
        }
        xbc.o(ougVar, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void d(ytg ytgVar) {
        iqc iqcVar = ytgVar.a;
        Object[] objArr = iqcVar.b;
        Object[] objArr2 = iqcVar.c;
        long[] jArr = iqcVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            oug ougVar = (oug) obj;
                            iqc iqcVar2 = this.a;
                            Object d = iqcVar2.d(ougVar);
                            ougVar.getClass();
                            Object invoke = ougVar.b.invoke(d, obj2);
                            if (invoke != null) {
                                iqcVar2.m(ougVar, invoke);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ytg) {
                ytg ytgVar = (ytg) obj;
                if (!Intrinsics.areEqual(this.a, ytgVar.a) || this.c != ytgVar.c || this.d != ytgVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + hdi.g(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        x0c x0cVar = this.b;
        if (x0cVar == null) {
            x0cVar = new x0c(this.a);
            this.b = x0cVar;
        }
        return ((qg7) x0cVar.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        iqc iqcVar = this.a;
        Object[] objArr = iqcVar.b;
        Object[] objArr2 = iqcVar.c;
        long[] jArr = iqcVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((oug) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return uzm.a(this) + "{ " + ((Object) sb) + " }";
    }
}
