package okhttp3.internal;

import java.text.Normalizer;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"normalizeNfc", "", "string", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class _NormalizeJvmKt {
    public static final String normalizeNfc(String str) {
        str.getClass();
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        normalize.getClass();
        return normalize;
    }
}
