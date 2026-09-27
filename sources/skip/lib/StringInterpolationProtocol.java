package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001b\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u0007H&¢\u0006\u0002\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lskip/lib/StringInterpolationProtocol;", "", "appendLiteral", "", "literal", "", "appendInterpolation", "T", "value", "(Ljava/lang/Object;)V", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StringInterpolationProtocol {
    <T> void appendInterpolation(T value);

    void appendLiteral(String literal);
}
