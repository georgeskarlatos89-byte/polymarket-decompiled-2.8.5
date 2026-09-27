package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Life;", "", "c", "b", "a", "Life$a;", "Life$b;", "Life$c;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ife extends Throwable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Life$a;", "Life;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class a extends ife {
        public static final a a = new Throwable();

        @Override // defpackage.ife
        public final String a() {
            return "externalPaymentMethodError";
        }

        @Override // defpackage.ife
        /* renamed from: b */
        public final String getC() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return -1706746466;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "ExternalPaymentMethod";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Life$b;", "Life;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class b extends ife {
        public final int a;
        public final String b;

        public b(int i) {
            this.a = i;
            this.b = String.valueOf(i);
        }

        @Override // defpackage.ife
        public final String a() {
            return k84.g("googlePay_", this.b);
        }

        @Override // defpackage.ife
        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.a == ((b) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return sv6.j(this.a, "GooglePay(errorCodeInt=", ")");
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Life$c;", "Life;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class c extends ife {
        public final Throwable a;
        public final s6i b;
        public final String c;

        public c(Throwable th) {
            String str;
            th.getClass();
            this.a = th;
            int i = s6i.e;
            s6i a = ksl.a(th);
            this.b = a;
            q6i q6iVar = a.a;
            if (q6iVar != null) {
                str = q6iVar.c;
            } else {
                str = null;
            }
            this.c = str;
        }

        @Override // defpackage.ife
        public final String a() {
            return this.b.getG();
        }

        @Override // defpackage.ife
        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && Intrinsics.areEqual(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return woa.p("Stripe(cause=", ")", this.a);
        }
    }

    public abstract String a();

    /* renamed from: b */
    public abstract String getC();
}
