package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wg7 extends l3 implements ug7, RandomAccess, Serializable {
    public final Enum[] b;

    public wg7(Enum[] enumArr) {
        enumArr.getClass();
        this.b = enumArr;
    }

    @Override // defpackage.o1, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        if (((Enum) ArraysKt.C(r3.ordinal(), this.b)) != r3) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h3 h3Var = l3.a;
        Enum[] enumArr = this.b;
        int length = enumArr.length;
        h3Var.getClass();
        h3.b(i, length);
        return enumArr[i];
    }

    @Override // defpackage.o1
    public final int getSize() {
        return this.b.length;
    }

    @Override // defpackage.l3, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) ArraysKt.C(ordinal, this.b)) != r3) {
            return -1;
        }
        return ordinal;
    }

    @Override // defpackage.l3, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) ArraysKt.C(ordinal, this.b)) != r3) {
            return -1;
        }
        return ordinal;
    }
}
