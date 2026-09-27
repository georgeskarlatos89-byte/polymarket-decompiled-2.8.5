package skip.lib;

import defpackage.ix2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00000\u0004B\u001f\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000H\u0096\u0002JB\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002(\b\u0002\u0010\u0019\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aJ\u000e\u0010\u001c\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u001d\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u001e\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00012\b\b\u0002\u0010\u0007\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0016HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u000f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0011\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0013\u001a\u00028\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b¨\u0006'"}, d2 = {"Lskip/lib/Tuple3;", "E0", "E1", "E2", "", "_e0", "_e1", "_e2", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "get_e0", "()Ljava/lang/Object;", "Ljava/lang/Object;", "get_e1", "get_e2", "element0", "getElement0", "element1", "getElement1", "element2", "getElement2", "compareTo", "", "other", "sref", "onUpdate", "Lkotlin/Function1;", "", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lskip/lib/Tuple3;", "equals", "", "", "hashCode", "toString", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Tuple3<E0, E1, E2> implements Comparable<Tuple3<E0, E1, E2>> {
    private final E0 _e0;
    private final E1 _e1;
    private final E2 _e2;

    public Tuple3(E0 e0, E1 e1, E2 e2) {
        this._e0 = e0;
        this._e1 = e1;
        this._e2 = e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tuple3 copy$default(Tuple3 tuple3, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = tuple3._e0;
        }
        if ((i & 2) != 0) {
            obj2 = tuple3._e1;
        }
        if ((i & 4) != 0) {
            obj3 = tuple3._e2;
        }
        return tuple3.copy(obj, obj2, obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tuple3 sref$default(Tuple3 tuple3, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return tuple3.sref(function1);
    }

    public int compareTo(Tuple3<E0, E1, E2> other) {
        other.getClass();
        E0 e0 = this._e0;
        if (!(e0 instanceof Comparable)) {
            return 0;
        }
        e0.getClass();
        int compareTo = ((Comparable) e0).compareTo(other._e0);
        if (compareTo != 0) {
            return compareTo;
        }
        E1 e1 = this._e1;
        if (!(e1 instanceof Comparable)) {
            return 0;
        }
        e1.getClass();
        int compareTo2 = ((Comparable) e1).compareTo(other._e1);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        E2 e2 = this._e2;
        if (!(e2 instanceof Comparable)) {
            return 0;
        }
        e2.getClass();
        return ((Comparable) e2).compareTo(other._e2);
    }

    public final E0 component1() {
        return this._e0;
    }

    public final E1 component2() {
        return this._e1;
    }

    public final E2 component3() {
        return this._e2;
    }

    public final Tuple3<E0, E1, E2> copy(E0 _e0, E1 _e1, E2 _e2) {
        return new Tuple3<>(_e0, _e1, _e2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tuple3)) {
            return false;
        }
        Tuple3 tuple3 = (Tuple3) other;
        if (Intrinsics.areEqual(this._e0, tuple3._e0) && Intrinsics.areEqual(this._e1, tuple3._e1) && Intrinsics.areEqual(this._e2, tuple3._e2)) {
            return true;
        }
        return false;
    }

    public final E0 getElement0() {
        return (E0) StructKt.sref$default(this._e0, null, 1, null);
    }

    public final E1 getElement1() {
        return (E1) StructKt.sref$default(this._e1, null, 1, null);
    }

    public final E2 getElement2() {
        return (E2) StructKt.sref$default(this._e2, null, 1, null);
    }

    public final E0 get_e0() {
        return this._e0;
    }

    public final E1 get_e1() {
        return this._e1;
    }

    public final E2 get_e2() {
        return this._e2;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        E0 e0 = this._e0;
        int i = 0;
        if (e0 == null) {
            hashCode = 0;
        } else {
            hashCode = e0.hashCode();
        }
        int i2 = hashCode * 31;
        E1 e1 = this._e1;
        if (e1 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = e1.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        E2 e2 = this._e2;
        if (e2 != null) {
            i = e2.hashCode();
        }
        return i3 + i;
    }

    public final Tuple3<E0, E1, E2> sref(Function1<? super Tuple3<E0, E1, E2>, Unit> onUpdate) {
        Object sref$default = StructKt.sref$default(this._e0, null, 1, null);
        Object sref$default2 = StructKt.sref$default(this._e1, null, 1, null);
        Object sref$default3 = StructKt.sref$default(this._e2, null, 1, null);
        if (sref$default == this._e0 && sref$default2 == this._e1 && sref$default3 == this._e2) {
            return this;
        }
        return new Tuple3<>(sref$default, sref$default2, sref$default3);
    }

    public String toString() {
        E0 e0 = this._e0;
        E1 e1 = this._e1;
        E2 e2 = this._e2;
        StringBuilder sb = new StringBuilder("Tuple3(_e0=");
        sb.append(e0);
        sb.append(", _e1=");
        sb.append(e1);
        sb.append(", _e2=");
        return ix2.o(sb, e2, ")");
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Tuple3) obj);
    }
}
