package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lskip/lib/DictionaryCodingKey;", "Lskip/lib/CodingKey;", "rawValue", "", "<init>", "(Ljava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DictionaryCodingKey implements CodingKey {
    private final String rawValue;

    public DictionaryCodingKey(String str) {
        str.getClass();
        this.rawValue = str;
    }

    @Override // skip.lib.CodingKey, skip.lib.CustomDebugStringConvertible
    public String getDebugDescription() {
        return super.getDebugDescription();
    }

    @Override // skip.lib.CodingKey
    public String getDescription() {
        return super.getDescription();
    }

    @Override // skip.lib.CodingKey
    public Integer getIntValue() {
        return super.getIntValue();
    }

    @Override // skip.lib.CodingKey
    public String getRawValue() {
        return this.rawValue;
    }

    @Override // skip.lib.CodingKey
    public String getStringValue() {
        return super.getStringValue();
    }
}
