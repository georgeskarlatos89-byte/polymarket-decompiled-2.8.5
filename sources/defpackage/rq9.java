package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;
import org.msgpack.core.MessagePacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rq9 extends x2 implements h3k, Iterable {
    public static final rq9 b = new rq9(new h3k[0]);
    public final h3k[] a;

    public rq9(h3k[] h3kVarArr) {
        this.a = h3kVarArr;
    }

    @Override // defpackage.h3k
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h3k) {
                h3k h3kVar = (h3k) obj;
                boolean z = h3kVar instanceof rq9;
                h3k[] h3kVarArr = this.a;
                if (z) {
                    return Arrays.equals(h3kVarArr, ((rq9) h3kVar).a);
                }
                x3k valueType = ((x2) h3kVar).getValueType();
                valueType.getClass();
                if (valueType == x3k.ARRAY) {
                    rq9 a = h3kVar.a();
                    if (h3kVarArr.length == a.a.length) {
                        Iterator it = a.iterator();
                        for (h3k h3kVar2 : h3kVarArr) {
                            qq9 qq9Var = (qq9) it;
                            if (qq9Var.hasNext() && h3kVar2.equals(qq9Var.next())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.h3k
    public final void f(MessagePacker messagePacker) {
        h3k[] h3kVarArr = this.a;
        messagePacker.packArrayHeader(h3kVarArr.length);
        for (h3k h3kVar : h3kVarArr) {
            h3kVar.f(messagePacker);
        }
    }

    @Override // defpackage.h3k
    public final x3k getValueType() {
        return x3k.ARRAY;
    }

    @Override // defpackage.h3k
    public final String h() {
        h3k[] h3kVarArr = this.a;
        if (h3kVarArr.length == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(h3kVarArr[0].h());
        for (int i = 1; i < h3kVarArr.length; i++) {
            sb.append(",");
            sb.append(h3kVarArr[i].h());
        }
        sb.append("]");
        return sb.toString();
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            h3k[] h3kVarArr = this.a;
            if (i2 < h3kVarArr.length) {
                i = (i * 31) + h3kVarArr[i2].hashCode();
                i2++;
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qq9(this.a, 0);
    }

    public final String toString() {
        h3k[] h3kVarArr = this.a;
        if (h3kVarArr.length == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder("[");
        x2 x2Var = (x2) h3kVarArr[0];
        if (x2Var.getValueType().a()) {
            sb.append(x2Var.h());
        } else {
            sb.append(x2Var.toString());
        }
        for (int i = 1; i < h3kVarArr.length; i++) {
            sb.append(",");
            x2 x2Var2 = (x2) h3kVarArr[i];
            if (x2Var2.getValueType().a()) {
                sb.append(x2Var2.h());
            } else {
                sb.append(x2Var2.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.x2, defpackage.h3k
    public final rq9 a() {
        return this;
    }

    @Override // defpackage.x2
    public final rq9 s() {
        return this;
    }
}
