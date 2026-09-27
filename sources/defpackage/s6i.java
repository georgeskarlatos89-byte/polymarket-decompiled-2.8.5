package defpackage;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ls6i;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ksl", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class s6i extends Exception {
    public static final /* synthetic */ int e = 0;
    public final q6i a;
    public final String b;
    public final int c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s6i(int i, int i2, q6i q6iVar, String str, String str2, Throwable th) {
        this(q6iVar, str, i, th, str2);
        q6iVar = (i2 & 1) != 0 ? null : q6iVar;
        str = (i2 & 2) != 0 ? null : str;
        i = (i2 & 4) != 0 ? 0 : i;
        th = (i2 & 8) != 0 ? null : th;
        if ((i2 & 16) != 0) {
            if (q6iVar != null) {
                str2 = q6iVar.b;
            } else {
                str2 = null;
            }
        }
    }

    public String a() {
        return "stripeException";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s6i) {
            s6i s6iVar = (s6i) obj;
            if (Intrinsics.areEqual(this.a, s6iVar.a) && Intrinsics.areEqual(this.b, s6iVar.b) && this.c == s6iVar.c && Intrinsics.areEqual(getMessage(), s6iVar.getMessage())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), getMessage());
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        String str2 = this.b;
        if (str2 != null) {
            str = "Request-id: ".concat(str2);
        } else {
            str = null;
        }
        return CollectionsKt.N(CollectionsKt.U(str, super.toString()), "\n", null, null, null, 62);
    }

    public s6i(q6i q6iVar, String str, int i, Throwable th, String str2) {
        super(str2, th);
        this.a = q6iVar;
        this.b = str;
        this.c = i;
        boolean z = false;
        if (400 <= i && i < 500) {
            z = true;
        }
        this.d = z;
    }
}
