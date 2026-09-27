package skip.foundation;

import java.security.MessageDigest;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lskip/foundation/NamedHashFunction;", "Digest", "Lskip/foundation/HashFunction;", "digest", "Ljava/security/MessageDigest;", "getDigest", "()Ljava/security/MessageDigest;", "digestName", "", "getDigestName", "()Ljava/lang/String;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NamedHashFunction<Digest> extends HashFunction {
    MessageDigest getDigest();

    String getDigestName();
}
