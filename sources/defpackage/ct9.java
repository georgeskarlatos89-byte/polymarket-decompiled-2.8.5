package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ct9 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final lfc d;
    public final String e;

    public ct9(Object obj, Object obj2, lfc lfcVar, lfc lfcVar2, String str) {
        this.a = obj;
        this.b = obj2;
        this.c = lfcVar;
        this.d = lfcVar2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ct9) {
                ct9 ct9Var = (ct9) obj;
                if (!Intrinsics.areEqual(this.a, ct9Var.a) || !Intrinsics.areEqual(this.b, ct9Var.b) || !Intrinsics.areEqual(this.c, ct9Var.c) || !Intrinsics.areEqual(this.d, ct9Var.d) || !Intrinsics.areEqual(this.e, ct9Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Object obj2 = this.c;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return this.e.hashCode() + ((this.d.hashCode() + ((i2 + i) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.a);
        sb.append(", compilerVersion=");
        sb.append(this.b);
        sb.append(", languageVersion=");
        sb.append(this.c);
        sb.append(", expectedVersion=");
        sb.append(this.d);
        sb.append(", filePath=");
        return m51.m(sb, this.e, ')');
    }
}
