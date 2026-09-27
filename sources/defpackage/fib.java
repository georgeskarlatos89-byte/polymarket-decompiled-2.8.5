package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fib extends AbstractMap implements Serializable {
    public static final tv4 i = new tv4(12);
    public final boolean b;
    public eib c;
    public final eib f;
    public dib g;
    public dib h;
    public int d = 0;
    public int e = 0;
    public final Comparator a = i;

    public fib(boolean z) {
        this.b = z;
        this.f = new eib(z);
    }

    public final eib a(Object obj, boolean z) {
        int i2;
        eib eibVar;
        Comparable comparable;
        eib eibVar2;
        eib eibVar3 = this.c;
        tv4 tv4Var = i;
        Comparator comparator = this.a;
        if (eibVar3 != null) {
            if (comparator == tv4Var) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = eibVar3.f;
                if (comparable != null) {
                    i2 = comparable.compareTo(obj2);
                } else {
                    i2 = comparator.compare(obj, obj2);
                }
                if (i2 == 0) {
                    return eibVar3;
                }
                if (i2 < 0) {
                    eibVar2 = eibVar3.b;
                } else {
                    eibVar2 = eibVar3.c;
                }
                if (eibVar2 == null) {
                    break;
                }
                eibVar3 = eibVar2;
            }
        } else {
            i2 = 0;
        }
        eib eibVar4 = eibVar3;
        if (!z) {
            return null;
        }
        eib eibVar5 = this.f;
        if (eibVar4 == null) {
            if (comparator == tv4Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            eibVar = new eib(this.b, eibVar4, obj, eibVar5, eibVar5.e);
            this.c = eibVar;
        } else {
            eibVar = new eib(this.b, eibVar4, obj, eibVar5, eibVar5.e);
            if (i2 < 0) {
                eibVar4.b = eibVar;
            } else {
                eibVar4.c = eibVar;
            }
            b(eibVar4, true);
        }
        this.d++;
        this.e++;
        return eibVar;
    }

    public final void b(eib eibVar, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        while (eibVar != null) {
            eib eibVar2 = eibVar.b;
            eib eibVar3 = eibVar.c;
            int i6 = 0;
            if (eibVar2 != null) {
                i2 = eibVar2.i;
            } else {
                i2 = 0;
            }
            if (eibVar3 != null) {
                i3 = eibVar3.i;
            } else {
                i3 = 0;
            }
            int i7 = i2 - i3;
            if (i7 == -2) {
                eib eibVar4 = eibVar3.b;
                eib eibVar5 = eibVar3.c;
                if (eibVar5 != null) {
                    i5 = eibVar5.i;
                } else {
                    i5 = 0;
                }
                if (eibVar4 != null) {
                    i6 = eibVar4.i;
                }
                int i8 = i6 - i5;
                if (i8 != -1 && (i8 != 0 || z)) {
                    f(eibVar3);
                    e(eibVar);
                } else {
                    e(eibVar);
                }
                if (z) {
                    return;
                }
            } else if (i7 == 2) {
                eib eibVar6 = eibVar2.b;
                eib eibVar7 = eibVar2.c;
                if (eibVar7 != null) {
                    i4 = eibVar7.i;
                } else {
                    i4 = 0;
                }
                if (eibVar6 != null) {
                    i6 = eibVar6.i;
                }
                int i9 = i6 - i4;
                if (i9 != 1 && (i9 != 0 || z)) {
                    e(eibVar2);
                    f(eibVar);
                } else {
                    f(eibVar);
                }
                if (z) {
                    return;
                }
            } else if (i7 == 0) {
                eibVar.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eibVar.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eibVar = eibVar.a;
        }
    }

    public final void c(eib eibVar, boolean z) {
        eib eibVar2;
        eib eibVar3;
        int i2;
        if (z) {
            eib eibVar4 = eibVar.e;
            eibVar4.d = eibVar.d;
            eibVar.d.e = eibVar4;
        }
        eib eibVar5 = eibVar.b;
        eib eibVar6 = eibVar.c;
        eib eibVar7 = eibVar.a;
        int i3 = 0;
        if (eibVar5 != null && eibVar6 != null) {
            if (eibVar5.i > eibVar6.i) {
                eib eibVar8 = eibVar5.c;
                while (true) {
                    eib eibVar9 = eibVar8;
                    eibVar3 = eibVar5;
                    eibVar5 = eibVar9;
                    if (eibVar5 == null) {
                        break;
                    } else {
                        eibVar8 = eibVar5.c;
                    }
                }
            } else {
                eib eibVar10 = eibVar6.b;
                while (true) {
                    eibVar2 = eibVar6;
                    eibVar6 = eibVar10;
                    if (eibVar6 == null) {
                        break;
                    } else {
                        eibVar10 = eibVar6.b;
                    }
                }
                eibVar3 = eibVar2;
            }
            c(eibVar3, false);
            eib eibVar11 = eibVar.b;
            if (eibVar11 != null) {
                i2 = eibVar11.i;
                eibVar3.b = eibVar11;
                eibVar11.a = eibVar3;
                eibVar.b = null;
            } else {
                i2 = 0;
            }
            eib eibVar12 = eibVar.c;
            if (eibVar12 != null) {
                i3 = eibVar12.i;
                eibVar3.c = eibVar12;
                eibVar12.a = eibVar3;
                eibVar.c = null;
            }
            eibVar3.i = Math.max(i2, i3) + 1;
            d(eibVar, eibVar3);
            return;
        }
        if (eibVar5 != null) {
            d(eibVar, eibVar5);
            eibVar.b = null;
        } else if (eibVar6 != null) {
            d(eibVar, eibVar6);
            eibVar.c = null;
        } else {
            d(eibVar, null);
        }
        b(eibVar7, false);
        this.d--;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        eib eibVar = this.f;
        eibVar.e = eibVar;
        eibVar.d = eibVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        eib eibVar = null;
        if (obj != null) {
            try {
                eibVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (eibVar == null) {
            return false;
        }
        return true;
    }

    public final void d(eib eibVar, eib eibVar2) {
        eib eibVar3 = eibVar.a;
        eibVar.a = null;
        if (eibVar2 != null) {
            eibVar2.a = eibVar3;
        }
        if (eibVar3 != null) {
            if (eibVar3.b == eibVar) {
                eibVar3.b = eibVar2;
                return;
            } else {
                eibVar3.c = eibVar2;
                return;
            }
        }
        this.c = eibVar2;
    }

    public final void e(eib eibVar) {
        int i2;
        int i3;
        eib eibVar2 = eibVar.b;
        eib eibVar3 = eibVar.c;
        eib eibVar4 = eibVar3.b;
        eib eibVar5 = eibVar3.c;
        eibVar.c = eibVar4;
        if (eibVar4 != null) {
            eibVar4.a = eibVar;
        }
        d(eibVar, eibVar3);
        eibVar3.b = eibVar;
        eibVar.a = eibVar3;
        int i4 = 0;
        if (eibVar2 != null) {
            i2 = eibVar2.i;
        } else {
            i2 = 0;
        }
        if (eibVar4 != null) {
            i3 = eibVar4.i;
        } else {
            i3 = 0;
        }
        int max = Math.max(i2, i3) + 1;
        eibVar.i = max;
        if (eibVar5 != null) {
            i4 = eibVar5.i;
        }
        eibVar3.i = Math.max(max, i4) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        dib dibVar = this.g;
        if (dibVar == null) {
            dib dibVar2 = new dib(this, 0);
            this.g = dibVar2;
            return dibVar2;
        }
        return dibVar;
    }

    public final void f(eib eibVar) {
        int i2;
        int i3;
        eib eibVar2 = eibVar.b;
        eib eibVar3 = eibVar.c;
        eib eibVar4 = eibVar2.b;
        eib eibVar5 = eibVar2.c;
        eibVar.b = eibVar5;
        if (eibVar5 != null) {
            eibVar5.a = eibVar;
        }
        d(eibVar, eibVar2);
        eibVar2.c = eibVar;
        eibVar.a = eibVar2;
        int i4 = 0;
        if (eibVar3 != null) {
            i2 = eibVar3.i;
        } else {
            i2 = 0;
        }
        if (eibVar5 != null) {
            i3 = eibVar5.i;
        } else {
            i3 = 0;
        }
        int max = Math.max(i2, i3) + 1;
        eibVar.i = max;
        if (eibVar4 != null) {
            i4 = eibVar4.i;
        }
        eibVar2.i = Math.max(max, i4) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        eib eibVar;
        if (obj != null) {
            try {
                eibVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eibVar != null) {
                return null;
            }
            return eibVar.h;
        }
        eibVar = null;
        if (eibVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        dib dibVar = this.h;
        if (dibVar == null) {
            dib dibVar2 = new dib(this, 1);
            this.h = dibVar2;
            return dibVar2;
        }
        return dibVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.b) {
                dmk.s("value == null");
                return null;
            }
            eib a = a(obj, true);
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
        eib eibVar;
        if (obj != null) {
            try {
                eibVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eibVar != null) {
                c(eibVar, true);
            }
            if (eibVar != null) {
                return null;
            }
            return eibVar.h;
        }
        eibVar = null;
        if (eibVar != null) {
        }
        if (eibVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
