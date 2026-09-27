package skip.foundation;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.NumberFormat;
import android.icu.util.Currency;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.e1d;
import defpackage.f05;
import defpackage.fdd;
import defpackage.hm6;
import defpackage.scb;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.foundation.Formatter;
import skip.lib.CustomStringConvertibleKt;
import skip.lib.GlobalsKt;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u0000 \u0092\u00012\u00020\u0001:\n\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\tJ\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u0085\u0001\u001a\u000207H\u0016J\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u0085\u0001\u001a\u00020%H\u0016J\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00162\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0016J\"\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0016\u0010\u0089\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u008a\u0001H\u0002J\u0017\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00162\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\u0014\u0010\u008e\u0001\u001a\u0004\u0018\u0001072\u0007\u0010\u0085\u0001\u001a\u00020\u0016H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005R$\u0010\r\u001a\u00020\u000e8V@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\tR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R$\u00104\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R(\u00108\u001a\u0004\u0018\u0001072\b\u0010\u0019\u001a\u0004\u0018\u0001078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010=\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0018\"\u0004\b?\u0010@R(\u0010A\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u0010@R(\u0010D\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010\u0018\"\u0004\bF\u0010@R(\u0010G\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010\u0018\"\u0004\bI\u0010@R&\u0010J\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\u0018\"\u0004\bM\u0010@R(\u0010N\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010\u0018\"\u0004\bP\u0010@R(\u0010Q\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u0010\u0018\"\u0004\bS\u0010@R$\u0010T\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010\u0018\"\u0004\bV\u0010@R$\u0010W\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bX\u0010\u0018\"\u0004\bY\u0010@R(\u0010Z\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u0010\u0018\"\u0004\b\\\u0010@R(\u0010]\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010\u0018\"\u0004\b_\u0010@R(\u0010`\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010\u0018\"\u0004\bb\u0010@R(\u0010c\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010\u0018\"\u0004\be\u0010@R(\u0010f\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010\u0018\"\u0004\bh\u0010@R(\u0010i\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bj\u0010\u0018\"\u0004\bk\u0010@R(\u0010l\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010\u0018\"\u0004\bn\u0010@R(\u0010o\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bp\u0010\u0018\"\u0004\bq\u0010@R(\u0010r\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bs\u0010\u0018\"\u0004\bt\u0010@R(\u0010u\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bv\u0010\u0018\"\u0004\bw\u0010@R$\u0010x\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\by\u0010(\"\u0004\bz\u0010*R$\u0010{\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b|\u0010(\"\u0004\b}\u0010*R%\u0010~\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010(\"\u0005\b\u0080\u0001\u0010*R'\u0010\u0081\u0001\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010(\"\u0005\b\u0083\u0001\u0010*¨\u0006\u0094\u0001"}, d2 = {"Lskip/foundation/NumberFormatter;", "Lskip/foundation/Formatter;", "platformValue", "Landroid/icu/text/DecimalFormat;", "<init>", "(Landroid/icu/text/DecimalFormat;)V", "()V", "style", "Lskip/foundation/NumberFormatter$Style;", "(Lskip/foundation/NumberFormatter$Style;)V", "getPlatformValue$SkipFoundation", "()Landroid/icu/text/DecimalFormat;", "setPlatformValue$SkipFoundation", "formattingContext", "Lskip/foundation/Formatter$Context;", "getFormattingContext$annotations", "getFormattingContext", "()Lskip/foundation/Formatter$Context;", "setFormattingContext", "(Lskip/foundation/Formatter$Context;)V", "_numberStyle", "description", "", "getDescription", "()Ljava/lang/String;", "newValue", "numberStyle", "getNumberStyle", "()Lskip/foundation/NumberFormatter$Style;", "setNumberStyle", "_locale", "Lskip/foundation/Locale;", "locale", "getLocale", "()Lskip/foundation/Locale;", "setLocale", "(Lskip/foundation/Locale;)V", "", "groupingSize", "getGroupingSize", "()I", "setGroupingSize", "(I)V", "", "generatesDecimalNumbers", "getGeneratesDecimalNumbers", "()Z", "setGeneratesDecimalNumbers", "(Z)V", "alwaysShowsDecimalSeparator", "getAlwaysShowsDecimalSeparator", "setAlwaysShowsDecimalSeparator", "usesGroupingSeparator", "getUsesGroupingSeparator", "setUsesGroupingSeparator", "Ljava/lang/Number;", "multiplier", "getMultiplier", "()Ljava/lang/Number;", "setMultiplier", "(Ljava/lang/Number;)V", "groupingSeparator", "getGroupingSeparator", "setGroupingSeparator", "(Ljava/lang/String;)V", "percentSymbol", "getPercentSymbol", "setPercentSymbol", "currencySymbol", "getCurrencySymbol", "setCurrencySymbol", "zeroSymbol", "getZeroSymbol", "setZeroSymbol", "plusSign", "getPlusSign$annotations", "getPlusSign", "setPlusSign", "minusSign", "getMinusSign", "setMinusSign", "exponentSymbol", "getExponentSymbol", "setExponentSymbol", "negativeInfinitySymbol", "getNegativeInfinitySymbol", "setNegativeInfinitySymbol", "positiveInfinitySymbol", "getPositiveInfinitySymbol", "setPositiveInfinitySymbol", "internationalCurrencySymbol", "getInternationalCurrencySymbol", "setInternationalCurrencySymbol", "decimalSeparator", "getDecimalSeparator", "setDecimalSeparator", AppsFlyerProperties.CURRENCY_CODE, "getCurrencyCode", "setCurrencyCode", "currencyDecimalSeparator", "getCurrencyDecimalSeparator", "setCurrencyDecimalSeparator", "currencyGroupingSeparator", "getCurrencyGroupingSeparator", "setCurrencyGroupingSeparator", "notANumberSymbol", "getNotANumberSymbol", "setNotANumberSymbol", "positiveSuffix", "getPositiveSuffix", "setPositiveSuffix", "negativeSuffix", "getNegativeSuffix", "setNegativeSuffix", "positivePrefix", "getPositivePrefix", "setPositivePrefix", "negativePrefix", "getNegativePrefix", "setNegativePrefix", "maximumFractionDigits", "getMaximumFractionDigits", "setMaximumFractionDigits", "minimumFractionDigits", "getMinimumFractionDigits", "setMinimumFractionDigits", "maximumIntegerDigits", "getMaximumIntegerDigits", "setMaximumIntegerDigits", "minimumIntegerDigits", "getMinimumIntegerDigits", "setMinimumIntegerDigits", "string", TicketDetailDestinationKt.LAUNCHED_FROM, "", "applySymbol", "", "block", "Lkotlin/Function1;", "Landroid/icu/text/DecimalFormatSymbols;", "for_", "", AttributeType.NUMBER, "Style", "PadPosition", "RoundingMode", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class NumberFormatter extends Formatter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Locale _locale;
    private Style _numberStyle;
    private Formatter.Context formattingContext;
    private DecimalFormat platformValue;
    private String plusSign;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u0011"}, d2 = {"Lskip/foundation/NumberFormatter$CompanionClass;", "Lskip/foundation/Formatter$CompanionClass;", "<init>", "()V", "localizedString", "", TicketDetailDestinationKt.LAUNCHED_FROM, "Ljava/lang/Number;", AttributeType.NUMBER, "Lskip/foundation/NumberFormatter$Style;", "Style", "rawValue", "", "PadPosition", "Lskip/foundation/NumberFormatter$PadPosition;", "RoundingMode", "Lskip/foundation/NumberFormatter$RoundingMode;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Formatter.CompanionClass {
        public PadPosition PadPosition(int rawValue) {
            return NumberFormatter.INSTANCE.PadPosition(rawValue);
        }

        public RoundingMode RoundingMode(int rawValue) {
            return NumberFormatter.INSTANCE.RoundingMode(rawValue);
        }

        public Style Style(int rawValue) {
            return NumberFormatter.INSTANCE.Style(rawValue);
        }

        public String localizedString(Number from, Style number) {
            from.getClass();
            number.getClass();
            return NumberFormatter.INSTANCE.localizedString(from, number);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Style.decimal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Style.currency.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Style.percent.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Style.scientific.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NumberFormatter() {
        this.formattingContext = Formatter.Context.unknown;
        this._numberStyle = Style.none;
        this._locale = Locale.INSTANCE.getCurrent();
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.getClass();
        setPlatformValue$SkipFoundation((DecimalFormat) integerInstance);
        setGroupingSize(0);
    }

    private static final Unit _set_currencyCode_$lambda$18(String str, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setInternationalCurrencySymbol(str);
        return Unit.INSTANCE;
    }

    private static final Unit _set_currencyDecimalSeparator_$lambda$20$lambda$19(char c, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setMonetaryDecimalSeparator(c);
        return Unit.INSTANCE;
    }

    private static final Unit _set_currencyGroupingSeparator_$lambda$22$lambda$21(char c, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setMonetaryGroupingSeparator(c);
        return Unit.INSTANCE;
    }

    private static final Unit _set_currencySymbol_$lambda$7(String str, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setCurrencySymbol(str);
        return Unit.INSTANCE;
    }

    private static final Unit _set_decimalSeparator_$lambda$17$lambda$16(char c, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setDecimalSeparator(c);
        return Unit.INSTANCE;
    }

    private static final Unit _set_exponentSymbol_$lambda$12(String str, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setExponentSeparator(str);
        return Unit.INSTANCE;
    }

    private static final Unit _set_groupingSeparator_$lambda$4$lambda$3(char c, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setGroupingSeparator(c);
        return Unit.INSTANCE;
    }

    private static final Unit _set_internationalCurrencySymbol_$lambda$15(String str, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setInternationalCurrencySymbol(str);
        return Unit.INSTANCE;
    }

    private static final Unit _set_locale_$lambda$1$lambda$0(Locale locale, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setCurrency(Currency.getInstance(locale.getPlatformValue()));
        return Unit.INSTANCE;
    }

    private static final Unit _set_minusSign_$lambda$11$lambda$10(char c, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setMinusSign(c);
        return Unit.INSTANCE;
    }

    private static final Unit _set_negativeInfinitySymbol_$lambda$13(String str, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setInfinity(str);
        return Unit.INSTANCE;
    }

    private static final Unit _set_notANumberSymbol_$lambda$23(String str, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setNaN(str);
        return Unit.INSTANCE;
    }

    private static final Unit _set_percentSymbol_$lambda$6$lambda$5(char c, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setPercent(c);
        return Unit.INSTANCE;
    }

    private static final Unit _set_positiveInfinitySymbol_$lambda$14(String str, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setInfinity(str);
        return Unit.INSTANCE;
    }

    private static final Unit _set_zeroSymbol_$lambda$9$lambda$8(char c, DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        decimalFormatSymbols.setZeroDigit(c);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(String str, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_negativeInfinitySymbol_$lambda$13(str, decimalFormatSymbols);
    }

    private final void applySymbol(Function1<? super DecimalFormatSymbols, Unit> block) {
        DecimalFormatSymbols decimalFormatSymbols = getPlatformValue().getDecimalFormatSymbols();
        if (decimalFormatSymbols != null) {
            block.invoke(decimalFormatSymbols);
            getPlatformValue().setDecimalFormatSymbols(decimalFormatSymbols);
        }
    }

    public static /* synthetic */ Unit b(char c, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_currencyGroupingSeparator_$lambda$22$lambda$21(c, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit c(char c, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_decimalSeparator_$lambda$17$lambda$16(c, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit d(char c, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_minusSign_$lambda$11$lambda$10(c, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit e(String str, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_notANumberSymbol_$lambda$23(str, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit f(String str, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_internationalCurrencySymbol_$lambda$15(str, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit g(String str, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_positiveInfinitySymbol_$lambda$14(str, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit h(Locale locale, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_locale_$lambda$1$lambda$0(locale, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit i(char c, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_percentSymbol_$lambda$6$lambda$5(c, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit j(char c, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_zeroSymbol_$lambda$9$lambda$8(c, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit k(String str, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_currencySymbol_$lambda$7(str, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit l(char c, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_currencyDecimalSeparator_$lambda$20$lambda$19(c, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit m(String str, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_exponentSymbol_$lambda$12(str, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit n(String str, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_currencyCode_$lambda$18(str, decimalFormatSymbols);
    }

    public static /* synthetic */ Unit o(char c, DecimalFormatSymbols decimalFormatSymbols) {
        return _set_groupingSeparator_$lambda$4$lambda$3(c, decimalFormatSymbols);
    }

    public boolean getAlwaysShowsDecimalSeparator() {
        return getPlatformValue().isDecimalSeparatorAlwaysShown();
    }

    public String getCurrencyCode() {
        return getPlatformValue().getDecimalFormatSymbols().getInternationalCurrencySymbol();
    }

    public String getCurrencyDecimalSeparator() {
        return String.valueOf(getPlatformValue().getDecimalFormatSymbols().getMonetaryDecimalSeparator());
    }

    public String getCurrencyGroupingSeparator() {
        return String.valueOf(getPlatformValue().getDecimalFormatSymbols().getMonetaryGroupingSeparator());
    }

    public String getCurrencySymbol() {
        return getPlatformValue().getDecimalFormatSymbols().getCurrencySymbol();
    }

    public String getDecimalSeparator() {
        return String.valueOf(getPlatformValue().getDecimalFormatSymbols().getDecimalSeparator());
    }

    public String getDescription() {
        return CustomStringConvertibleKt.getDescription(getPlatformValue());
    }

    public String getExponentSymbol() {
        return getPlatformValue().getDecimalFormatSymbols().getExponentSeparator();
    }

    @Override // skip.foundation.Formatter
    public Formatter.Context getFormattingContext() {
        return super.getFormattingContext();
    }

    public boolean getGeneratesDecimalNumbers() {
        return getPlatformValue().isParseBigDecimal();
    }

    public String getGroupingSeparator() {
        return String.valueOf(getPlatformValue().getDecimalFormatSymbols().getGroupingSeparator());
    }

    public int getGroupingSize() {
        return getPlatformValue().getGroupingSize();
    }

    public String getInternationalCurrencySymbol() {
        return getPlatformValue().getDecimalFormatSymbols().getInternationalCurrencySymbol();
    }

    /* renamed from: getLocale, reason: from getter */
    public Locale get_locale() {
        return this._locale;
    }

    public int getMaximumFractionDigits() {
        return getPlatformValue().getMaximumFractionDigits();
    }

    public int getMaximumIntegerDigits() {
        return getPlatformValue().getMaximumIntegerDigits();
    }

    public int getMinimumFractionDigits() {
        return getPlatformValue().getMinimumFractionDigits();
    }

    public int getMinimumIntegerDigits() {
        return getPlatformValue().getMinimumIntegerDigits();
    }

    public String getMinusSign() {
        return String.valueOf(getPlatformValue().getDecimalFormatSymbols().getMinusSign());
    }

    public Number getMultiplier() {
        return Integer.valueOf(getPlatformValue().getMultiplier());
    }

    public String getNegativeInfinitySymbol() {
        String infinity = getPlatformValue().getDecimalFormatSymbols().getInfinity();
        infinity.getClass();
        return infinity;
    }

    public String getNegativePrefix() {
        return getPlatformValue().getNegativePrefix();
    }

    public String getNegativeSuffix() {
        return getPlatformValue().getNegativeSuffix();
    }

    public String getNotANumberSymbol() {
        return getPlatformValue().getDecimalFormatSymbols().getNaN();
    }

    /* renamed from: getNumberStyle, reason: from getter */
    public Style get_numberStyle() {
        return this._numberStyle;
    }

    public String getPercentSymbol() {
        return String.valueOf(getPlatformValue().getDecimalFormatSymbols().getPercent());
    }

    /* renamed from: getPlatformValue$SkipFoundation, reason: from getter */
    public DecimalFormat getPlatformValue() {
        return this.platformValue;
    }

    public String getPlusSign() {
        return this.plusSign;
    }

    public String getPositiveInfinitySymbol() {
        String infinity = getPlatformValue().getDecimalFormatSymbols().getInfinity();
        infinity.getClass();
        return infinity;
    }

    public String getPositivePrefix() {
        return getPlatformValue().getPositivePrefix();
    }

    public String getPositiveSuffix() {
        return getPlatformValue().getPositiveSuffix();
    }

    public boolean getUsesGroupingSeparator() {
        return getPlatformValue().isGroupingUsed();
    }

    public String getZeroSymbol() {
        return String.valueOf(getPlatformValue().getDecimalFormatSymbols().getZeroDigit());
    }

    public Number number(String from) {
        from.getClass();
        Number parse = getPlatformValue().parse(from);
        if (parse != null) {
            return parse;
        }
        return null;
    }

    public void setAlwaysShowsDecimalSeparator(boolean z) {
        getPlatformValue().setDecimalSeparatorAlwaysShown(z);
    }

    public void setCurrencyCode(String str) {
        applySymbol(new scb(str, 13));
    }

    public void setCurrencyDecimalSeparator(String str) {
        java.lang.Character first;
        if (str != null && (first = skip.lib.StringKt.getFirst(str)) != null) {
            applySymbol(new fdd(first.charValue(), 0));
        }
    }

    public void setCurrencyGroupingSeparator(String str) {
        java.lang.Character first;
        if (str != null && (first = skip.lib.StringKt.getFirst(str)) != null) {
            applySymbol(new fdd(first.charValue(), 6));
        }
    }

    public void setCurrencySymbol(String str) {
        applySymbol(new scb(str, 8));
    }

    public void setDecimalSeparator(String str) {
        java.lang.Character first;
        if (str != null && (first = skip.lib.StringKt.getFirst(str)) != null) {
            applySymbol(new fdd(first.charValue(), 5));
        }
    }

    public void setExponentSymbol(String str) {
        applySymbol(new scb(str, 12));
    }

    @Override // skip.foundation.Formatter
    public void setFormattingContext(Formatter.Context context) {
        context.getClass();
        this.formattingContext = context;
    }

    public void setGeneratesDecimalNumbers(boolean z) {
        getPlatformValue().setParseBigDecimal(z);
    }

    public void setGroupingSeparator(String str) {
        java.lang.Character first;
        if (str != null && (first = skip.lib.StringKt.getFirst(str)) != null) {
            applySymbol(new fdd(first.charValue(), 4));
        }
    }

    public void setGroupingSize(int i) {
        getPlatformValue().setGroupingSize(i);
    }

    public void setInternationalCurrencySymbol(String str) {
        applySymbol(new scb(str, 14));
    }

    public void setLocale(Locale locale) {
        this._locale = locale;
        if (locale != null) {
            applySymbol(new e1d(locale, 5));
        }
    }

    public void setMaximumFractionDigits(int i) {
        getPlatformValue().setMaximumFractionDigits(i);
    }

    public void setMaximumIntegerDigits(int i) {
        getPlatformValue().setMaximumIntegerDigits(i);
    }

    public void setMinimumFractionDigits(int i) {
        getPlatformValue().setMinimumFractionDigits(i);
    }

    public void setMinimumIntegerDigits(int i) {
        getPlatformValue().setMinimumIntegerDigits(i);
    }

    public void setMinusSign(String str) {
        java.lang.Character first;
        if (str != null && (first = skip.lib.StringKt.getFirst(str)) != null) {
            applySymbol(new fdd(first.charValue(), 1));
        }
    }

    public void setMultiplier(Number number) {
        if (number != null) {
            getPlatformValue().setMultiplier(NumberKt.getIntValue(number));
        }
    }

    public void setNegativeInfinitySymbol(String str) {
        str.getClass();
        applySymbol(new scb(str, 10));
    }

    public void setNegativePrefix(String str) {
        getPlatformValue().setNegativePrefix(str);
    }

    public void setNegativeSuffix(String str) {
        getPlatformValue().setNegativeSuffix(str);
    }

    public void setNotANumberSymbol(String str) {
        applySymbol(new scb(str, 9));
    }

    public void setNumberStyle(Style style) {
        java.util.Locale locale;
        DecimalFormat decimalFormat;
        java.util.Locale locale2;
        java.util.Locale locale3;
        java.util.Locale locale4;
        java.util.Locale locale5;
        style.getClass();
        getPlatformValue();
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        java.util.Locale locale6 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            Locale locale7 = this._locale;
                            if (locale7 != null) {
                                locale5 = locale7.getPlatformValue();
                            } else {
                                locale5 = null;
                            }
                            if (locale5 != null) {
                                NumberFormat scientificInstance = NumberFormat.getScientificInstance(locale5);
                                scientificInstance.getClass();
                                decimalFormat = (DecimalFormat) scientificInstance;
                            } else {
                                NumberFormat scientificInstance2 = NumberFormat.getScientificInstance();
                                scientificInstance2.getClass();
                                decimalFormat = (DecimalFormat) scientificInstance2;
                            }
                        } else {
                            GlobalsKt.fatalError("SkipNumberFormatter: unsupported style " + style);
                            f05.c();
                            return;
                        }
                    } else {
                        Locale locale8 = this._locale;
                        if (locale8 != null) {
                            locale4 = locale8.getPlatformValue();
                        } else {
                            locale4 = null;
                        }
                        if (locale4 != null) {
                            NumberFormat percentInstance = NumberFormat.getPercentInstance(locale4);
                            percentInstance.getClass();
                            decimalFormat = (DecimalFormat) percentInstance;
                        } else {
                            NumberFormat percentInstance2 = NumberFormat.getPercentInstance();
                            percentInstance2.getClass();
                            decimalFormat = (DecimalFormat) percentInstance2;
                        }
                    }
                } else {
                    Locale locale9 = this._locale;
                    if (locale9 != null) {
                        locale3 = locale9.getPlatformValue();
                    } else {
                        locale3 = null;
                    }
                    if (locale3 != null) {
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale3);
                        currencyInstance.getClass();
                        decimalFormat = (DecimalFormat) currencyInstance;
                    } else {
                        NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance();
                        currencyInstance2.getClass();
                        decimalFormat = (DecimalFormat) currencyInstance2;
                    }
                }
            } else {
                Locale locale10 = this._locale;
                if (locale10 != null) {
                    locale2 = locale10.getPlatformValue();
                } else {
                    locale2 = null;
                }
                if (locale2 != null) {
                    NumberFormat numberInstance = NumberFormat.getNumberInstance(locale2);
                    numberInstance.getClass();
                    decimalFormat = (DecimalFormat) numberInstance;
                } else {
                    NumberFormat numberInstance2 = NumberFormat.getNumberInstance();
                    numberInstance2.getClass();
                    decimalFormat = (DecimalFormat) numberInstance2;
                }
            }
        } else {
            Locale locale11 = this._locale;
            if (locale11 != null) {
                locale = locale11.getPlatformValue();
            } else {
                locale = null;
            }
            if (locale != null) {
                NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
                integerInstance.getClass();
                decimalFormat = (DecimalFormat) integerInstance;
            } else {
                NumberFormat integerInstance2 = NumberFormat.getIntegerInstance();
                integerInstance2.getClass();
                decimalFormat = (DecimalFormat) integerInstance2;
            }
        }
        DecimalFormatSymbols decimalFormatSymbols = (DecimalFormatSymbols) StructKt.sref$default(getPlatformValue().getDecimalFormatSymbols(), null, 1, null);
        Locale locale12 = this._locale;
        if (locale12 != null) {
            locale6 = locale12.getPlatformValue();
        }
        if (locale6 != null) {
            getPlatformValue().applyLocalizedPattern(decimalFormat.toLocalizedPattern());
            decimalFormatSymbols.setCurrency(Currency.getInstance(locale6));
        } else {
            getPlatformValue().applyPattern(decimalFormat.toPattern());
        }
        getPlatformValue().setDecimalFormatSymbols(decimalFormatSymbols);
    }

    public void setPercentSymbol(String str) {
        java.lang.Character first;
        if (str != null && (first = skip.lib.StringKt.getFirst(str)) != null) {
            applySymbol(new fdd(first.charValue(), 2));
        }
    }

    public void setPlatformValue$SkipFoundation(DecimalFormat decimalFormat) {
        decimalFormat.getClass();
        this.platformValue = decimalFormat;
    }

    public void setPlusSign(String str) {
        this.plusSign = str;
    }

    public void setPositiveInfinitySymbol(String str) {
        str.getClass();
        applySymbol(new scb(str, 11));
    }

    public void setPositivePrefix(String str) {
        getPlatformValue().setPositivePrefix(str);
    }

    public void setPositiveSuffix(String str) {
        getPlatformValue().setPositiveSuffix(str);
    }

    public void setUsesGroupingSeparator(boolean z) {
        getPlatformValue().setGroupingUsed(z);
    }

    public void setZeroSymbol(String str) {
        java.lang.Character first;
        if (str != null && (first = skip.lib.StringKt.getFirst(str)) != null) {
            applySymbol(new fdd(first.charValue(), 3));
        }
    }

    @Override // skip.foundation.Formatter
    public String string(Object for_) {
        Number number;
        Boolean bool;
        if (for_ instanceof Number) {
            number = (Number) for_;
        } else {
            number = null;
        }
        if (number != null) {
            return string(number);
        }
        if (for_ instanceof Boolean) {
            bool = (Boolean) for_;
        } else {
            bool = null;
        }
        if (bool == null) {
            return null;
        }
        return string(Intrinsics.areEqual(bool, Boolean.TRUE) ? 1 : 0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u000fB\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lskip/foundation/NumberFormatter$PadPosition;", "Lskip/lib/RawRepresentable;", "", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "beforePrefix", "afterPrefix", "beforeSuffix", "afterSuffix", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PadPosition implements RawRepresentable<Integer> {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ PadPosition[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int rawValue;
        public static final PadPosition beforePrefix = new PadPosition("beforePrefix", 0, 0, null, 2, null);
        public static final PadPosition afterPrefix = new PadPosition("afterPrefix", 1, 1, null, 2, null);
        public static final PadPosition beforeSuffix = new PadPosition("beforeSuffix", 2, 2, null, 2, null);
        public static final PadPosition afterSuffix = new PadPosition("afterSuffix", 3, 3, null, 2, null);

        private static final /* synthetic */ PadPosition[] $values() {
            return new PadPosition[]{beforePrefix, afterPrefix, beforeSuffix, afterSuffix};
        }

        static {
            PadPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ PadPosition(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : r4);
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static PadPosition valueOf(String str) {
            return (PadPosition) Enum.valueOf(PadPosition.class, str);
        }

        public static PadPosition[] values() {
            return (PadPosition[]) $VALUES.clone();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.RawRepresentable
        public Integer getRawValue() {
            return Integer.valueOf(this.rawValue);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lskip/foundation/NumberFormatter$PadPosition$Companion;", "", "<init>", "()V", "init", "Lskip/foundation/NumberFormatter$PadPosition;", "rawValue", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PadPosition init(int rawValue) {
                if (rawValue != 0) {
                    if (rawValue != 1) {
                        if (rawValue != 2) {
                            if (rawValue != 3) {
                                return null;
                            }
                            return PadPosition.afterSuffix;
                        }
                        return PadPosition.beforeSuffix;
                    }
                    return PadPosition.afterPrefix;
                }
                return PadPosition.beforePrefix;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ Integer getRawValue() {
            return getRawValue();
        }

        private PadPosition(String str, int i, int i2, Void r4) {
            this.rawValue = i2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0012B\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lskip/foundation/NumberFormatter$RoundingMode;", "Lskip/lib/RawRepresentable;", "", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "ceiling", PlaceTypes.FLOOR, "down", "up", "halfEven", "halfDown", "halfUp", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RoundingMode implements RawRepresentable<Integer> {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RoundingMode[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int rawValue;
        public static final RoundingMode ceiling = new RoundingMode("ceiling", 0, 0, null, 2, null);
        public static final RoundingMode floor = new RoundingMode(PlaceTypes.FLOOR, 1, 1, null, 2, null);
        public static final RoundingMode down = new RoundingMode("down", 2, 2, null, 2, null);
        public static final RoundingMode up = new RoundingMode("up", 3, 3, null, 2, null);
        public static final RoundingMode halfEven = new RoundingMode("halfEven", 4, 4, null, 2, null);
        public static final RoundingMode halfDown = new RoundingMode("halfDown", 5, 5, null, 2, null);
        public static final RoundingMode halfUp = new RoundingMode("halfUp", 6, 6, null, 2, null);

        private static final /* synthetic */ RoundingMode[] $values() {
            return new RoundingMode[]{ceiling, floor, down, up, halfEven, halfDown, halfUp};
        }

        static {
            RoundingMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ RoundingMode(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : r4);
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RoundingMode valueOf(String str) {
            return (RoundingMode) Enum.valueOf(RoundingMode.class, str);
        }

        public static RoundingMode[] values() {
            return (RoundingMode[]) $VALUES.clone();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.RawRepresentable
        public Integer getRawValue() {
            return Integer.valueOf(this.rawValue);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lskip/foundation/NumberFormatter$RoundingMode$Companion;", "", "<init>", "()V", "init", "Lskip/foundation/NumberFormatter$RoundingMode;", "rawValue", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RoundingMode init(int rawValue) {
                switch (rawValue) {
                    case 0:
                        return RoundingMode.ceiling;
                    case 1:
                        return RoundingMode.floor;
                    case 2:
                        return RoundingMode.down;
                    case 3:
                        return RoundingMode.up;
                    case 4:
                        return RoundingMode.halfEven;
                    case 5:
                        return RoundingMode.halfDown;
                    case 6:
                        return RoundingMode.halfUp;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ Integer getRawValue() {
            return getRawValue();
        }

        private RoundingMode(String str, int i, int i2, Void r4) {
            this.rawValue = i2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lskip/foundation/NumberFormatter$Style;", "Lskip/lib/RawRepresentable;", "", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "none", "decimal", "currency", "percent", "scientific", "spellOut", "ordinal_", "currencyISOCode", "currencyPlural", "currencyAccounting", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Style implements RawRepresentable<Integer> {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int rawValue;
        public static final Style none = new Style("none", 0, 0, null, 2, null);
        public static final Style decimal = new Style("decimal", 1, 1, null, 2, null);
        public static final Style currency = new Style("currency", 2, 2, null, 2, null);
        public static final Style percent = new Style("percent", 3, 3, null, 2, null);
        public static final Style scientific = new Style("scientific", 4, 4, null, 2, null);
        public static final Style spellOut = new Style("spellOut", 5, 5, null, 2, null);
        public static final Style ordinal_ = new Style("ordinal_", 6, 6, null, 2, null);
        public static final Style currencyISOCode = new Style("currencyISOCode", 7, 8, null, 2, null);
        public static final Style currencyPlural = new Style("currencyPlural", 8, 9, null, 2, null);
        public static final Style currencyAccounting = new Style("currencyAccounting", 9, 10, null, 2, null);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{none, decimal, currency, percent, scientific, spellOut, ordinal_, currencyISOCode, currencyPlural, currencyAccounting};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Style(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : r4);
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.RawRepresentable
        public Integer getRawValue() {
            return Integer.valueOf(this.rawValue);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lskip/foundation/NumberFormatter$Style$Companion;", "", "<init>", "()V", "init", "Lskip/foundation/NumberFormatter$Style;", "rawValue", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Style init(int rawValue) {
                switch (rawValue) {
                    case 0:
                        return Style.none;
                    case 1:
                        return Style.decimal;
                    case 2:
                        return Style.currency;
                    case 3:
                        return Style.percent;
                    case 4:
                        return Style.scientific;
                    case 5:
                        return Style.spellOut;
                    case 6:
                        return Style.ordinal_;
                    case 7:
                    default:
                        return null;
                    case 8:
                        return Style.currencyISOCode;
                    case 9:
                        return Style.currencyPlural;
                    case 10:
                        return Style.currencyAccounting;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ Integer getRawValue() {
            return getRawValue();
        }

        private Style(String str, int i, int i2, Void r4) {
            this.rawValue = i2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u0011"}, d2 = {"Lskip/foundation/NumberFormatter$Companion;", "Lskip/foundation/NumberFormatter$CompanionClass;", "<init>", "()V", "localizedString", "", TicketDetailDestinationKt.LAUNCHED_FROM, "Ljava/lang/Number;", AttributeType.NUMBER, "Lskip/foundation/NumberFormatter$Style;", "Style", "rawValue", "", "PadPosition", "Lskip/foundation/NumberFormatter$PadPosition;", "RoundingMode", "Lskip/foundation/NumberFormatter$RoundingMode;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Style.values().length];
                try {
                    iArr[Style.none.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Style.decimal.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Style.currency.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Style.percent.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Style.scientific.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.NumberFormatter.CompanionClass
        public PadPosition PadPosition(int rawValue) {
            return PadPosition.INSTANCE.init(rawValue);
        }

        @Override // skip.foundation.NumberFormatter.CompanionClass
        public RoundingMode RoundingMode(int rawValue) {
            return RoundingMode.INSTANCE.init(rawValue);
        }

        @Override // skip.foundation.NumberFormatter.CompanionClass
        public Style Style(int rawValue) {
            return Style.INSTANCE.init(rawValue);
        }

        @Override // skip.foundation.NumberFormatter.CompanionClass
        public String localizedString(Number from, Style number) {
            from.getClass();
            number.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[number.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return String.valueOf(from);
                            }
                            String format = NumberFormat.getScientificInstance().format(from);
                            format.getClass();
                            return format;
                        }
                        String format2 = NumberFormat.getPercentInstance().format(from);
                        format2.getClass();
                        return format2;
                    }
                    String format3 = NumberFormat.getCurrencyInstance().format(from);
                    format3.getClass();
                    return format3;
                }
                String format4 = NumberFormat.getNumberInstance().format(from);
                format4.getClass();
                return format4;
            }
            String format5 = NumberFormat.getIntegerInstance().format(from);
            format5.getClass();
            return format5;
        }

        private Companion() {
        }
    }

    @hm6
    public static /* synthetic */ void getFormattingContext$annotations() {
    }

    @hm6
    public static /* synthetic */ void getPlusSign$annotations() {
    }

    public NumberFormatter(DecimalFormat decimalFormat) {
        decimalFormat.getClass();
        this.formattingContext = Formatter.Context.unknown;
        this._numberStyle = Style.none;
        this._locale = Locale.INSTANCE.getCurrent();
        setPlatformValue$SkipFoundation(decimalFormat);
    }

    public String string(int from) {
        return string((Number) Integer.valueOf(from));
    }

    public String string(double from) {
        return string((Number) Double.valueOf(from));
    }

    private NumberFormatter(Style style) {
        this();
        setNumberStyle(style);
    }

    public String string(Number from) {
        from.getClass();
        return getPlatformValue().format(from);
    }
}
