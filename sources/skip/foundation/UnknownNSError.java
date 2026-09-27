package skip.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Error;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00072\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lskip/foundation/UnknownNSError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lskip/lib/Error;", "<init>", "()V", "MissingErrorCase", "Companion", "Lskip/foundation/UnknownNSError$MissingErrorCase;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UnknownNSError extends Exception implements Error {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lskip/foundation/UnknownNSError$MissingErrorCase;", "Lskip/foundation/UnknownNSError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MissingErrorCase extends UnknownNSError {
        public MissingErrorCase() {
            super(null);
        }

        public boolean equals(Object other) {
            return other instanceof MissingErrorCase;
        }

        public int hashCode() {
            return 1176015538;
        }
    }

    public /* synthetic */ UnknownNSError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // skip.lib.Error
    public String getLocalizedDescription() {
        return super.getLocalizedDescription();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lskip/foundation/UnknownNSError$Companion;", "", "<init>", "()V", "missingError", "Lskip/foundation/UnknownNSError;", "getMissingError", "()Lskip/foundation/UnknownNSError;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UnknownNSError getMissingError() {
            return new MissingErrorCase();
        }

        private Companion() {
        }
    }

    private UnknownNSError() {
    }
}
