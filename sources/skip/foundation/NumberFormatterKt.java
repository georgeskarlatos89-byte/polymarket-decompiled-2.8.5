package skip.foundation;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"formatted", "", "", "style", "Lskip/foundation/FormatStyle;", "SkipFoundation"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumberFormatterKt {
    public static final String formatted(Number number) {
        number.getClass();
        String format = FormatStyle.INSTANCE.getNumber().getFormatter().format(number);
        format.getClass();
        return format;
    }

    public static final String formatted(Number number, FormatStyle formatStyle) {
        number.getClass();
        formatStyle.getClass();
        String format = formatStyle.getFormatter().format(number);
        format.getClass();
        return format;
    }
}
