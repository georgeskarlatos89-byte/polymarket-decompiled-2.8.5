package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rs4 implements Map.Entry, aka {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ rs4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.a) {
            case 1:
                if (obj == null || !(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!Intrinsics.areEqual(entry.getKey(), this.b) || !Intrinsics.areEqual(entry.getValue(), this.c)) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.a) {
            case 1:
                Object obj = this.b;
                obj.getClass();
                int hashCode = obj.hashCode() + 527;
                Object obj2 = this.c;
                obj2.getClass();
                return obj2.hashCode() + hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("not implemented");
            default:
                this.c = obj;
                return obj;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append('=');
                sb.append(this.c);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
