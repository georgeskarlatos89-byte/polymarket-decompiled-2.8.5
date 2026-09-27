package defpackage;

import com.appsflyer.internal.l;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bib extends AbstractMap implements Serializable {
    public static final tv4 i = new tv4(11);
    public yhb g;
    public yhb h;
    public int d = 0;
    public int e = 0;
    public final Comparator a = i;
    public final aib c = new aib();
    public aib[] b = new aib[16];
    public int f = 12;

    public final aib a(Object obj, boolean z) {
        int i2;
        aib aibVar;
        char c;
        boolean z2;
        aib aibVar2;
        aib aibVar3;
        aib aibVar4;
        aib aibVar5;
        Comparable comparable;
        aib aibVar6;
        aib[] aibVarArr = this.b;
        int hashCode = obj.hashCode();
        int i3 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        char c2 = 4;
        int i4 = ((i3 >>> 7) ^ i3) ^ (i3 >>> 4);
        boolean z3 = true;
        int length = i4 & (aibVarArr.length - 1);
        aib aibVar7 = aibVarArr[length];
        tv4 tv4Var = i;
        Comparator comparator = this.a;
        if (aibVar7 != null) {
            if (comparator == tv4Var) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = aibVar7.f;
                if (comparable != null) {
                    i2 = comparable.compareTo(obj2);
                } else {
                    i2 = comparator.compare(obj, obj2);
                }
                if (i2 == 0) {
                    return aibVar7;
                }
                if (i2 < 0) {
                    aibVar6 = aibVar7.b;
                } else {
                    aibVar6 = aibVar7.c;
                }
                if (aibVar6 == null) {
                    break;
                }
                aibVar7 = aibVar6;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        aib aibVar8 = this.c;
        if (aibVar7 == null) {
            if (comparator == tv4Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            aibVar = new aib(aibVar7, obj, i4, aibVar8, aibVar8.e);
            aibVarArr[length] = aibVar;
        } else {
            aib aibVar9 = aibVar7;
            aibVar = new aib(aibVar9, obj, i4, aibVar8, aibVar8.e);
            if (i2 < 0) {
                aibVar9.b = aibVar;
            } else {
                aibVar9.c = aibVar;
            }
            b(aibVar9, true);
        }
        int i5 = this.d;
        this.d = i5 + 1;
        if (i5 > this.f) {
            aib[] aibVarArr2 = this.b;
            int length2 = aibVarArr2.length;
            int i6 = length2 * 2;
            aib[] aibVarArr3 = new aib[i6];
            gg1 gg1Var = new gg1(4);
            gg1 gg1Var2 = new gg1(4);
            int i7 = 0;
            while (i7 < length2) {
                aib aibVar10 = aibVarArr2[i7];
                if (aibVar10 == null) {
                    c = c2;
                    z2 = z3;
                } else {
                    aib aibVar11 = null;
                    for (aib aibVar12 = aibVar10; aibVar12 != null; aibVar12 = aibVar12.b) {
                        aibVar12.a = aibVar11;
                        aibVar11 = aibVar12;
                    }
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (aibVar11 == null) {
                            c = c2;
                            z2 = z3;
                            aibVar2 = aibVar11;
                            aibVar11 = null;
                        } else {
                            c = c2;
                            aib aibVar13 = aibVar11.a;
                            aibVar11.a = null;
                            z2 = z3;
                            aib aibVar14 = aibVar11.c;
                            while (true) {
                                aib aibVar15 = aibVar14;
                                aibVar2 = aibVar13;
                                aibVar13 = aibVar15;
                                if (aibVar13 == null) {
                                    break;
                                }
                                aibVar13.a = aibVar2;
                                aibVar14 = aibVar13.b;
                            }
                        }
                        if (aibVar11 == null) {
                            break;
                        }
                        if ((aibVar11.g & length2) == 0) {
                            i8++;
                        } else {
                            i9++;
                        }
                        aibVar11 = aibVar2;
                        c2 = c;
                        z3 = z2;
                    }
                    gg1Var.b = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    gg1Var.d = 0;
                    gg1Var.c = 0;
                    gg1Var.e = null;
                    gg1Var2.b = ((Integer.highestOneBit(i9) * 2) - 1) - i9;
                    gg1Var2.d = 0;
                    gg1Var2.c = 0;
                    gg1Var2.e = null;
                    aib aibVar16 = null;
                    while (aibVar10 != null) {
                        aibVar10.a = aibVar16;
                        aib aibVar17 = aibVar10;
                        aibVar10 = aibVar10.b;
                        aibVar16 = aibVar17;
                    }
                    while (true) {
                        if (aibVar16 == null) {
                            aibVar3 = aibVar16;
                            aibVar16 = null;
                        } else {
                            aib aibVar18 = aibVar16.a;
                            aibVar16.a = null;
                            aib aibVar19 = aibVar16.c;
                            while (true) {
                                aib aibVar20 = aibVar19;
                                aibVar3 = aibVar18;
                                aibVar18 = aibVar20;
                                if (aibVar18 == null) {
                                    break;
                                }
                                aibVar18.a = aibVar3;
                                aibVar19 = aibVar18.b;
                            }
                        }
                        if (aibVar16 == null) {
                            break;
                        }
                        if ((aibVar16.g & length2) == 0) {
                            gg1Var.a(aibVar16);
                        } else {
                            gg1Var2.a(aibVar16);
                        }
                        aibVar16 = aibVar3;
                    }
                    if (i8 > 0) {
                        aibVar4 = (aib) gg1Var.e;
                        if (aibVar4.a != null) {
                            l.o();
                            return null;
                        }
                    } else {
                        aibVar4 = null;
                    }
                    aibVarArr3[i7] = aibVar4;
                    int i10 = i7 + length2;
                    if (i9 > 0) {
                        aibVar5 = (aib) gg1Var2.e;
                        if (aibVar5.a != null) {
                            l.o();
                            return null;
                        }
                    } else {
                        aibVar5 = null;
                    }
                    aibVarArr3[i10] = aibVar5;
                }
                i7++;
                c2 = c;
                z3 = z2;
            }
            this.b = aibVarArr3;
            this.f = (i6 / 4) + (i6 / 2);
        }
        this.e++;
        return aibVar;
    }

    public final void b(aib aibVar, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        while (aibVar != null) {
            aib aibVar2 = aibVar.b;
            aib aibVar3 = aibVar.c;
            int i6 = 0;
            if (aibVar2 != null) {
                i2 = aibVar2.i;
            } else {
                i2 = 0;
            }
            if (aibVar3 != null) {
                i3 = aibVar3.i;
            } else {
                i3 = 0;
            }
            int i7 = i2 - i3;
            if (i7 == -2) {
                aib aibVar4 = aibVar3.b;
                aib aibVar5 = aibVar3.c;
                if (aibVar5 != null) {
                    i5 = aibVar5.i;
                } else {
                    i5 = 0;
                }
                if (aibVar4 != null) {
                    i6 = aibVar4.i;
                }
                int i8 = i6 - i5;
                if (i8 != -1 && (i8 != 0 || z)) {
                    f(aibVar3);
                }
                e(aibVar);
                if (z) {
                    return;
                }
            } else if (i7 == 2) {
                aib aibVar6 = aibVar2.b;
                aib aibVar7 = aibVar2.c;
                if (aibVar7 != null) {
                    i4 = aibVar7.i;
                } else {
                    i4 = 0;
                }
                if (aibVar6 != null) {
                    i6 = aibVar6.i;
                }
                int i9 = i6 - i4;
                if (i9 != 1 && (i9 != 0 || z)) {
                    e(aibVar2);
                }
                f(aibVar);
                if (z) {
                    return;
                }
            } else if (i7 == 0) {
                aibVar.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                aibVar.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            aibVar = aibVar.a;
        }
    }

    public final void c(aib aibVar, boolean z) {
        aib aibVar2;
        aib aibVar3;
        int i2;
        if (z) {
            aib aibVar4 = aibVar.e;
            aibVar4.d = aibVar.d;
            aibVar.d.e = aibVar4;
            aibVar.e = null;
            aibVar.d = null;
        }
        aib aibVar5 = aibVar.b;
        aib aibVar6 = aibVar.c;
        aib aibVar7 = aibVar.a;
        int i3 = 0;
        if (aibVar5 != null && aibVar6 != null) {
            if (aibVar5.i > aibVar6.i) {
                aib aibVar8 = aibVar5.c;
                while (true) {
                    aib aibVar9 = aibVar8;
                    aibVar3 = aibVar5;
                    aibVar5 = aibVar9;
                    if (aibVar5 == null) {
                        break;
                    } else {
                        aibVar8 = aibVar5.c;
                    }
                }
            } else {
                aib aibVar10 = aibVar6.b;
                while (true) {
                    aibVar2 = aibVar6;
                    aibVar6 = aibVar10;
                    if (aibVar6 == null) {
                        break;
                    } else {
                        aibVar10 = aibVar6.b;
                    }
                }
                aibVar3 = aibVar2;
            }
            c(aibVar3, false);
            aib aibVar11 = aibVar.b;
            if (aibVar11 != null) {
                i2 = aibVar11.i;
                aibVar3.b = aibVar11;
                aibVar11.a = aibVar3;
                aibVar.b = null;
            } else {
                i2 = 0;
            }
            aib aibVar12 = aibVar.c;
            if (aibVar12 != null) {
                i3 = aibVar12.i;
                aibVar3.c = aibVar12;
                aibVar12.a = aibVar3;
                aibVar.c = null;
            }
            aibVar3.i = Math.max(i2, i3) + 1;
            d(aibVar, aibVar3);
            return;
        }
        if (aibVar5 != null) {
            d(aibVar, aibVar5);
            aibVar.b = null;
        } else if (aibVar6 != null) {
            d(aibVar, aibVar6);
            aibVar.c = null;
        } else {
            d(aibVar, null);
        }
        b(aibVar7, false);
        this.d--;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.b, (Object) null);
        this.d = 0;
        this.e++;
        aib aibVar = this.c;
        aib aibVar2 = aibVar.d;
        while (aibVar2 != aibVar) {
            aib aibVar3 = aibVar2.d;
            aibVar2.e = null;
            aibVar2.d = null;
            aibVar2 = aibVar3;
        }
        aibVar.e = aibVar;
        aibVar.d = aibVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        aib aibVar = null;
        if (obj != null) {
            try {
                aibVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (aibVar == null) {
            return false;
        }
        return true;
    }

    public final void d(aib aibVar, aib aibVar2) {
        aib aibVar3 = aibVar.a;
        aibVar.a = null;
        if (aibVar2 != null) {
            aibVar2.a = aibVar3;
        }
        if (aibVar3 != null) {
            if (aibVar3.b == aibVar) {
                aibVar3.b = aibVar2;
                return;
            } else {
                aibVar3.c = aibVar2;
                return;
            }
        }
        int i2 = aibVar.g;
        this.b[i2 & (r2.length - 1)] = aibVar2;
    }

    public final void e(aib aibVar) {
        int i2;
        int i3;
        aib aibVar2 = aibVar.b;
        aib aibVar3 = aibVar.c;
        aib aibVar4 = aibVar3.b;
        aib aibVar5 = aibVar3.c;
        aibVar.c = aibVar4;
        if (aibVar4 != null) {
            aibVar4.a = aibVar;
        }
        d(aibVar, aibVar3);
        aibVar3.b = aibVar;
        aibVar.a = aibVar3;
        int i4 = 0;
        if (aibVar2 != null) {
            i2 = aibVar2.i;
        } else {
            i2 = 0;
        }
        if (aibVar4 != null) {
            i3 = aibVar4.i;
        } else {
            i3 = 0;
        }
        int max = Math.max(i2, i3) + 1;
        aibVar.i = max;
        if (aibVar5 != null) {
            i4 = aibVar5.i;
        }
        aibVar3.i = Math.max(max, i4) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        yhb yhbVar = this.g;
        if (yhbVar != null) {
            return yhbVar;
        }
        yhb yhbVar2 = new yhb(this, 0);
        this.g = yhbVar2;
        return yhbVar2;
    }

    public final void f(aib aibVar) {
        int i2;
        int i3;
        aib aibVar2 = aibVar.b;
        aib aibVar3 = aibVar.c;
        aib aibVar4 = aibVar2.b;
        aib aibVar5 = aibVar2.c;
        aibVar.b = aibVar5;
        if (aibVar5 != null) {
            aibVar5.a = aibVar;
        }
        d(aibVar, aibVar2);
        aibVar2.c = aibVar;
        aibVar.a = aibVar2;
        int i4 = 0;
        if (aibVar3 != null) {
            i2 = aibVar3.i;
        } else {
            i2 = 0;
        }
        if (aibVar5 != null) {
            i3 = aibVar5.i;
        } else {
            i3 = 0;
        }
        int max = Math.max(i2, i3) + 1;
        aibVar.i = max;
        if (aibVar4 != null) {
            i4 = aibVar4.i;
        }
        aibVar2.i = Math.max(max, i4) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        aib aibVar;
        if (obj != null) {
            try {
                aibVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (aibVar != null) {
                return null;
            }
            return aibVar.h;
        }
        aibVar = null;
        if (aibVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        yhb yhbVar = this.h;
        if (yhbVar != null) {
            return yhbVar;
        }
        yhb yhbVar2 = new yhb(this, 1);
        this.h = yhbVar2;
        return yhbVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            aib a = a(obj, true);
            Object obj3 = a.h;
            a.h = obj2;
            return obj3;
        }
        dmk.s("key == null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        aib aibVar;
        if (obj != null) {
            try {
                aibVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (aibVar != null) {
                c(aibVar, true);
            }
            if (aibVar != null) {
                return null;
            }
            return aibVar.h;
        }
        aibVar = null;
        if (aibVar != null) {
        }
        if (aibVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
