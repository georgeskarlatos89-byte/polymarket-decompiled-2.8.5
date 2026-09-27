package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lskip/lib/CodingKey;", "Lskip/lib/CustomDebugStringConvertible;", "rawValue", "", "getRawValue", "()Ljava/lang/String;", "stringValue", "getStringValue", "intValue", "", "getIntValue", "()Ljava/lang/Integer;", "description", "getDescription", "debugDescription", "getDebugDescription", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CodingKey extends CustomDebugStringConvertible {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static String getDebugDescription(CodingKey codingKey) {
            return CodingKey.access$getDebugDescription$jd(codingKey);
        }

        @Deprecated
        public static String getDescription(CodingKey codingKey) {
            return CodingKey.access$getDescription$jd(codingKey);
        }

        @Deprecated
        public static Integer getIntValue(CodingKey codingKey) {
            return CodingKey.access$getIntValue$jd(codingKey);
        }

        @Deprecated
        public static String getStringValue(CodingKey codingKey) {
            return CodingKey.access$getStringValue$jd(codingKey);
        }
    }

    static /* synthetic */ String access$getDebugDescription$jd(CodingKey codingKey) {
        return super.getDebugDescription();
    }

    static /* synthetic */ String access$getDescription$jd(CodingKey codingKey) {
        return super.getDescription();
    }

    static /* synthetic */ Integer access$getIntValue$jd(CodingKey codingKey) {
        return super.getIntValue();
    }

    static /* synthetic */ String access$getStringValue$jd(CodingKey codingKey) {
        return super.getStringValue();
    }

    @Override // skip.lib.CustomDebugStringConvertible
    default String getDebugDescription() {
        return getRawValue();
    }

    default String getDescription() {
        return getRawValue();
    }

    default Integer getIntValue() {
        return NumbersKt.Int(getRawValue());
    }

    String getRawValue();

    default String getStringValue() {
        return getRawValue();
    }
}
