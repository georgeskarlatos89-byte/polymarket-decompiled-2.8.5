package skip.keychain;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Error;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004:\u0001\u0017B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\b\u0010\u0010\u001a\u00020\nH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0018"}, d2 = {"Lskip/keychain/KeychainError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lskip/lib/Error;", "Lskip/lib/SwiftProjecting;", "invalidValue", "", "<init>", "(Z)V", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "description", "getDescription", "toString", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "SkipKeychain"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeychainError extends Exception implements Error, SwiftProjecting {
    private final String message;

    public KeychainError(boolean z) {
        String str;
        if (z) {
            str = "Invalid value";
        } else {
            str = "Uknown error";
        }
        this.message = str;
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getDescription() {
        return getMessage();
    }

    @Override // skip.lib.Error
    public String getLocalizedDescription() {
        return super.getLocalizedDescription();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getDescription();
    }

    public /* synthetic */ KeychainError(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public KeychainError(String str) {
        str.getClass();
        this.message = str;
    }
}
