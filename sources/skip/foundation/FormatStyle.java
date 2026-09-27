package skip.foundation;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lskip/foundation/FormatStyle;", "", "formatter", "Landroid/icu/text/DecimalFormat;", "<init>", "(Landroid/icu/text/DecimalFormat;)V", "getFormatter$SkipFoundation", "()Landroid/icu/text/DecimalFormat;", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FormatStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FormatStyle currency;
    private static final FormatStyle number;
    private static final FormatStyle percent;
    private static final FormatStyle scientific;
    private final DecimalFormat formatter;

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.getClass();
        number = new FormatStyle((DecimalFormat) numberInstance);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.getClass();
        currency = new FormatStyle((DecimalFormat) currencyInstance);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.getClass();
        percent = new FormatStyle((DecimalFormat) percentInstance);
        NumberFormat scientificInstance = NumberFormat.getScientificInstance();
        scientificInstance.getClass();
        scientific = new FormatStyle((DecimalFormat) scientificInstance);
    }

    public FormatStyle(DecimalFormat decimalFormat) {
        decimalFormat.getClass();
        this.formatter = decimalFormat;
    }

    public static final /* synthetic */ FormatStyle access$getCurrency$cp() {
        return currency;
    }

    public static final /* synthetic */ FormatStyle access$getNumber$cp() {
        return number;
    }

    public static final /* synthetic */ FormatStyle access$getPercent$cp() {
        return percent;
    }

    public static final /* synthetic */ FormatStyle access$getScientific$cp() {
        return scientific;
    }

    /* renamed from: getFormatter$SkipFoundation, reason: from getter */
    public final DecimalFormat getFormatter() {
        return this.formatter;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lskip/foundation/FormatStyle$Companion;", "", "<init>", "()V", AttributeType.NUMBER, "Lskip/foundation/FormatStyle;", "getNumber", "()Lskip/foundation/FormatStyle;", "currency", "getCurrency", "percent", "getPercent", "scientific", "getScientific", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FormatStyle getCurrency() {
            return FormatStyle.access$getCurrency$cp();
        }

        public final FormatStyle getNumber() {
            return FormatStyle.access$getNumber$cp();
        }

        public final FormatStyle getPercent() {
            return FormatStyle.access$getPercent$cp();
        }

        public final FormatStyle getScientific() {
            return FormatStyle.access$getScientific$cp();
        }

        private Companion() {
        }
    }
}
