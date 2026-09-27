package skip.lib;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lskip/lib/EncodingError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lskip/lib/Error;", "<init>", "()V", "InvalidValueCase", "Context", "Companion", "Lskip/lib/EncodingError$InvalidValueCase;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EncodingError extends Exception implements Error {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lskip/lib/EncodingError$InvalidValueCase;", "Lskip/lib/EncodingError;", "associated0", "", "associated1", "Lskip/lib/EncodingError$Context;", "<init>", "(Ljava/lang/Object;Lskip/lib/EncodingError$Context;)V", "getAssociated0", "()Ljava/lang/Object;", "getAssociated1", "()Lskip/lib/EncodingError$Context;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidValueCase extends EncodingError {
        private final Object associated0;
        private final Context associated1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidValueCase(Object obj, Context context) {
            super(null);
            obj.getClass();
            context.getClass();
            this.associated0 = obj;
            this.associated1 = context;
        }

        public final Object getAssociated0() {
            return this.associated0;
        }

        public final Context getAssociated1() {
            return this.associated1;
        }
    }

    public /* synthetic */ EncodingError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // skip.lib.Error
    public String getLocalizedDescription() {
        return super.getLocalizedDescription();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lskip/lib/EncodingError$Companion;", "", "<init>", "()V", "invalidValue", "Lskip/lib/EncodingError;", "associated0", "associated1", "Lskip/lib/EncodingError$Context;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EncodingError invalidValue(Object associated0, Context associated1) {
            associated0.getClass();
            associated1.getClass();
            return new InvalidValueCase(associated0, associated1);
        }

        private Companion() {
        }
    }

    private EncodingError() {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B+\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lskip/lib/EncodingError$Context;", "", "codingPath", "Lskip/lib/Array;", "Lskip/lib/CodingKey;", "debugDescription", "", "underlyingError", "Lskip/lib/Error;", "<init>", "(Lskip/lib/Array;Ljava/lang/String;Lskip/lib/Error;)V", "getCodingPath", "()Lskip/lib/Array;", "getDebugDescription", "()Ljava/lang/String;", "getUnderlyingError", "()Lskip/lib/Error;", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Context {
        private final Array<CodingKey> codingPath;
        private final String debugDescription;
        private final Error underlyingError;

        public Context(Array<CodingKey> array, String str, Error error) {
            array.getClass();
            str.getClass();
            this.codingPath = (Array) StructKt.sref$default(array, null, 1, null);
            this.debugDescription = str;
            this.underlyingError = (Error) StructKt.sref$default(error, null, 1, null);
        }

        public final Array<CodingKey> getCodingPath() {
            return this.codingPath;
        }

        public final String getDebugDescription() {
            return this.debugDescription;
        }

        public final Error getUnderlyingError() {
            return this.underlyingError;
        }

        public /* synthetic */ Context(Array array, String str, Error error, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(array, str, (i & 4) != 0 ? null : error);
        }
    }
}
