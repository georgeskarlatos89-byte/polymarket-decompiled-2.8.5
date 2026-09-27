package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/EqualityMode;", "", "<init>", "()V", "KotlinSignature", "JavaSignature", "Lkotlin/reflect/jvm/internal/EqualityMode$JavaSignature;", "Lkotlin/reflect/jvm/internal/EqualityMode$KotlinSignature;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EqualityMode {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/EqualityMode$JavaSignature;", "Lkotlin/reflect/jvm/internal/EqualityMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class JavaSignature extends EqualityMode {
        public static final JavaSignature INSTANCE = new JavaSignature();

        private JavaSignature() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof JavaSignature)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1427933141;
        }

        public String toString() {
            return "JavaSignature";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/EqualityMode$KotlinSignature;", "Lkotlin/reflect/jvm/internal/EqualityMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class KotlinSignature extends EqualityMode {
        public static final KotlinSignature INSTANCE = new KotlinSignature();

        private KotlinSignature() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof KotlinSignature)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -773436692;
        }

        public String toString() {
            return "KotlinSignature";
        }
    }

    public /* synthetic */ EqualityMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EqualityMode() {
    }
}
