package skip.foundation;

import kotlin.Metadata;
import skip.lib.Error;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lskip/foundation/UnableToDeleteFileError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lskip/lib/Error;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath$SkipFoundation", "()Ljava/lang/String;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnableToDeleteFileError extends Exception implements Error {
    private final String path;

    public UnableToDeleteFileError(String str) {
        str.getClass();
        this.path = str;
    }

    @Override // skip.lib.Error
    public String getLocalizedDescription() {
        return super.getLocalizedDescription();
    }

    /* renamed from: getPath$SkipFoundation, reason: from getter */
    public final String getPath() {
        return this.path;
    }
}
