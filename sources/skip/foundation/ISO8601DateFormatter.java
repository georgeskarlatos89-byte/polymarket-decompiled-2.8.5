package skip.foundation;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.py2;
import defpackage.zj9;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.AttributeType;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import skip.foundation.DateFormatter;
import skip.lib.ErrorKt;
import skip.lib.MutableStruct;
import skip.lib.NullReturnException;
import skip.lib.NumbersKt;
import skip.lib.OptionSet;
import skip.lib.SetAlgebra;
import skip.lib.StructKt;
import skip.lib.Tuple2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000  2\u00020\u0001:\u0003\u001f !B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lskip/foundation/ISO8601DateFormatter;", "Lskip/foundation/DateFormatter;", "<init>", "()V", "newValue", "Ljava/time/format/DateTimeFormatter;", "dateParser", "getDateParser", "()Ljava/time/format/DateTimeFormatter;", "setDateParser", "(Ljava/time/format/DateTimeFormatter;)V", "dateFormatter", "getDateFormatter", "setDateFormatter", "Lskip/foundation/ISO8601DateFormatter$Options;", "formatOptions", "getFormatOptions", "()Lskip/foundation/ISO8601DateFormatter$Options;", "setFormatOptions", "(Lskip/foundation/ISO8601DateFormatter$Options;)V", "buildDateFormatter", "parse", "", AttributeType.DATE, "Lskip/foundation/Date;", TicketDetailDestinationKt.LAUNCHED_FROM, "", "string", "for_", "", "suppresssideeffects", "Options", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ISO8601DateFormatter extends DateFormatter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private DateTimeFormatter dateFormatter;
    private DateTimeFormatter dateParser;
    private Options formatOptions = new Options(0, null);
    private boolean suppresssideeffects;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lskip/foundation/ISO8601DateFormatter$CompanionClass;", "Lskip/foundation/DateFormatter$CompanionClass;", "<init>", "()V", "string", "", TicketDetailDestinationKt.LAUNCHED_FROM, "Lskip/foundation/Date;", "timeZone", "Lskip/foundation/TimeZone;", "formatOptions", "Lskip/foundation/ISO8601DateFormatter$Options;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends DateFormatter.CompanionClass {
        public static /* synthetic */ String string$default(CompanionClass companionClass, Date date, TimeZone timeZone, Options options, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    options = Options.INSTANCE.getWithInternetDateTime();
                }
                return companionClass.string(date, timeZone, options);
            }
            py2.f("Super calls with default arguments not supported in this target, function: string");
            return null;
        }

        public String string(Date from, TimeZone timeZone, Options formatOptions) {
            from.getClass();
            timeZone.getClass();
            formatOptions.getClass();
            return ISO8601DateFormatter.INSTANCE.string(from, timeZone, formatOptions);
        }
    }

    public ISO8601DateFormatter() {
        TimeZone timeZone = null;
        this.suppresssideeffects = true;
        try {
            setFormatOptions(Options.INSTANCE.getWithInternetDateTime());
            try {
                timeZone = new TimeZone("UTC");
            } catch (NullReturnException unused) {
            }
            setTimeZone(timeZone);
            setDateParser(buildDateFormatter(true));
            setDateFormatter(buildDateFormatter(false));
        } finally {
            this.suppresssideeffects = false;
        }
    }

    private static final Unit _get_dateFormatter_$lambda$1(ISO8601DateFormatter iSO8601DateFormatter, DateTimeFormatter dateTimeFormatter) {
        dateTimeFormatter.getClass();
        iSO8601DateFormatter.setDateFormatter(dateTimeFormatter);
        return Unit.INSTANCE;
    }

    private static final Unit _get_dateParser_$lambda$0(ISO8601DateFormatter iSO8601DateFormatter, DateTimeFormatter dateTimeFormatter) {
        dateTimeFormatter.getClass();
        iSO8601DateFormatter.setDateParser(dateTimeFormatter);
        return Unit.INSTANCE;
    }

    private static final Unit _get_formatOptions_$lambda$2(ISO8601DateFormatter iSO8601DateFormatter, Options options) {
        options.getClass();
        iSO8601DateFormatter.setFormatOptions(options);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.Ref$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    private final DateTimeFormatter buildDateFormatter(boolean parse) {
        boolean z;
        boolean z2;
        int i;
        String str;
        String str2;
        ?? obj = new Object();
        obj.a = new DateTimeFormatterBuilder();
        Options formatOptions = getFormatOptions();
        Options.Companion companion = Options.INSTANCE;
        boolean contains = formatOptions.contains(companion.getWithInternetDateTime());
        boolean contains2 = getFormatOptions().contains(companion.getWithDay());
        boolean contains3 = getFormatOptions().contains(companion.getWithMonth());
        boolean contains4 = getFormatOptions().contains(companion.getWithYear());
        boolean contains5 = getFormatOptions().contains(companion.getWithWeekOfYear());
        if (!contains && !getFormatOptions().contains(companion.getWithFullDate())) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !contains2 && !contains3 && !contains4 && !contains5) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            ?? obj2 = new Object();
            if (z || contains4) {
                ((DateTimeFormatterBuilder) obj.a).appendValue(ChronoField.YEAR, 4);
                obj2.a = true;
            }
            if (z || contains3) {
                buildDateFormatter$appendSeparator(this, obj2, obj);
                ((DateTimeFormatterBuilder) obj.a).appendValue(ChronoField.MONTH_OF_YEAR, 2);
            }
            if (contains5) {
                buildDateFormatter$appendSeparator(this, obj2, obj);
                ((DateTimeFormatterBuilder) obj.a).appendLiteral("W");
                ((DateTimeFormatterBuilder) obj.a).appendValue(ChronoField.ALIGNED_WEEK_OF_YEAR);
            }
            if (z || contains2) {
                buildDateFormatter$appendSeparator(this, obj2, obj);
                if (contains5) {
                    ((DateTimeFormatterBuilder) obj.a).appendValue(ChronoField.DAY_OF_WEEK, 2);
                } else if (!z && !contains3) {
                    ((DateTimeFormatterBuilder) obj.a).appendValue(ChronoField.DAY_OF_YEAR);
                } else {
                    ((DateTimeFormatterBuilder) obj.a).appendValue(ChronoField.DAY_OF_MONTH, 2);
                }
            }
        }
        if (getFormatOptions().contains(companion.getWithTime()) || contains || getFormatOptions().contains(companion.getWithFullTime())) {
            if (z2) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder = (DateTimeFormatterBuilder) obj.a;
                if (getFormatOptions().contains(companion.getWithSpaceBetweenDateAndTime())) {
                    str = ApiConstant.SPACE;
                } else {
                    str = "T";
                }
                dateTimeFormatterBuilder.appendLiteral(str);
            }
            boolean contains6 = getFormatOptions().contains(companion.getWithColonSeparatorInTime());
            ((DateTimeFormatterBuilder) obj.a).appendValue(ChronoField.HOUR_OF_DAY, 2);
            if (contains6) {
                ((DateTimeFormatterBuilder) obj.a).appendLiteral(":");
            }
            ((DateTimeFormatterBuilder) obj.a).appendValue(ChronoField.MINUTE_OF_HOUR, 2);
            if (contains6) {
                ((DateTimeFormatterBuilder) obj.a).appendLiteral(":");
            }
            ((DateTimeFormatterBuilder) obj.a).appendValue(ChronoField.SECOND_OF_MINUTE, 2);
            if (getFormatOptions().contains(companion.getWithFractionalSeconds())) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder2 = (DateTimeFormatterBuilder) obj.a;
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                if (parse) {
                    i = 9;
                } else {
                    i = 3;
                }
                dateTimeFormatterBuilder2.appendFraction(chronoField, 0, i, true);
            }
        }
        if (contains || getFormatOptions().contains(companion.getWithTimeZone())) {
            boolean contains7 = getFormatOptions().contains(companion.getWithColonSeparatorInTimeZone());
            Object obj3 = obj.a;
            if (parse) {
                ((DateTimeFormatterBuilder) obj3).appendPattern("[XXX][XX][X]");
            } else {
                DateTimeFormatterBuilder dateTimeFormatterBuilder3 = (DateTimeFormatterBuilder) obj3;
                if (contains7) {
                    str2 = "+HH:MM";
                } else {
                    str2 = "+HHMM";
                }
                dateTimeFormatterBuilder3.appendOffset(str2, "Z");
            }
        }
        DateTimeFormatter formatter = ((DateTimeFormatterBuilder) obj.a).toFormatter();
        formatter.getClass();
        return formatter;
    }

    private static final void buildDateFormatter$appendSeparator(ISO8601DateFormatter iSO8601DateFormatter, Ref.a aVar, Ref.ObjectRef<DateTimeFormatterBuilder> objectRef) {
        boolean contains = iSO8601DateFormatter.getFormatOptions().contains(Options.INSTANCE.getWithDashSeparatorInDate());
        if (aVar.a && contains) {
            ((DateTimeFormatterBuilder) objectRef.a).appendLiteral("-");
        }
        aVar.a = true;
    }

    public static /* synthetic */ Unit f(ISO8601DateFormatter iSO8601DateFormatter, DateTimeFormatter dateTimeFormatter) {
        return _get_dateParser_$lambda$0(iSO8601DateFormatter, dateTimeFormatter);
    }

    public static /* synthetic */ Unit g(ISO8601DateFormatter iSO8601DateFormatter, Options options) {
        return _get_formatOptions_$lambda$2(iSO8601DateFormatter, options);
    }

    private final DateTimeFormatter getDateFormatter() {
        return (DateTimeFormatter) StructKt.sref(this.dateFormatter, new zj9(this, 0));
    }

    private final DateTimeFormatter getDateParser() {
        return (DateTimeFormatter) StructKt.sref(this.dateParser, new zj9(this, 2));
    }

    public static /* synthetic */ Unit h(ISO8601DateFormatter iSO8601DateFormatter, DateTimeFormatter dateTimeFormatter) {
        return _get_dateFormatter_$lambda$1(iSO8601DateFormatter, dateTimeFormatter);
    }

    private final void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
        this.dateFormatter = (DateTimeFormatter) StructKt.sref$default(dateTimeFormatter, null, 1, null);
    }

    private final void setDateParser(DateTimeFormatter dateTimeFormatter) {
        this.dateParser = (DateTimeFormatter) StructKt.sref$default(dateTimeFormatter, null, 1, null);
    }

    @Override // skip.foundation.DateFormatter
    public Date date(String from) {
        java.util.Date from2;
        from.getClass();
        try {
            TemporalAccessor parse = getDateParser().parse(from);
            if (parse == null || (from2 = java.util.Date.from(Instant.from(parse))) == null) {
                return null;
            }
            return new Date(from2);
        } catch (Throwable th) {
            ErrorKt.aserror(th);
            return null;
        }
    }

    public Options getFormatOptions() {
        return (Options) StructKt.sref(this.formatOptions, new zj9(this, 1));
    }

    public void setFormatOptions(Options options) {
        options.getClass();
        this.formatOptions = (Options) StructKt.sref$default(options, null, 1, null);
        if (!this.suppresssideeffects) {
            setDateParser(buildDateFormatter(true));
            setDateFormatter(buildDateFormatter(false));
        }
    }

    @Override // skip.foundation.DateFormatter
    public String string(Date from) {
        ZoneId zoneId;
        java.util.TimeZone platformValue$SkipFoundation;
        from.getClass();
        DateTimeFormatter dateFormatter = getDateFormatter();
        Instant instant = from.getPlatformValue$SkipFoundation().toInstant();
        TimeZone timeZone = getTimeZone();
        if (timeZone != null && (platformValue$SkipFoundation = timeZone.getPlatformValue$SkipFoundation()) != null) {
            zoneId = platformValue$SkipFoundation.toZoneId();
        } else {
            zoneId = null;
        }
        String format = dateFormatter.format(instant.atZone(zoneId));
        format.getClass();
        return format;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001(B\u0011\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lskip/foundation/ISO8601DateFormatter$Options;", "Lskip/lib/OptionSet;", "Lkotlin/UInt;", "Lskip/lib/MutableStruct;", "copy", "<init>", "(Lskip/lib/MutableStruct;)V", "rawValue", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lhkj;", "rawvaluelong", "makeoptionset-VKZWuLQ", "(J)Lskip/foundation/ISO8601DateFormatter$Options;", "makeoptionset", "target", "", "assignoptionset", "(Lskip/foundation/ISO8601DateFormatter$Options;)V", "scopy", "()Lskip/lib/MutableStruct;", "assignfrom", "I", "getRawValue-pVg5ArA", "()I", "setRawValue-WZ4Q5Ns", "(I)V", "Lkotlin/Function1;", "", "supdate", "Lkotlin/jvm/functions/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "getRawvaluelong-s-VKNKU", "()J", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Options implements OptionSet<Options, UInt>, MutableStruct {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Options withColonSeparatorInTime;
        private static final Options withColonSeparatorInTimeZone;
        private static final Options withDashSeparatorInDate;
        private static final Options withDay;
        private static final Options withFractionalSeconds;
        private static final Options withFullDate;
        private static final Options withFullTime;
        private static final Options withInternetDateTime;
        private static final Options withMonth;
        private static final Options withSpaceBetweenDateAndTime;
        private static final Options withTime;
        private static final Options withTimeZone;
        private static final Options withWeekOfYear;
        private static final Options withYear;
        private int rawValue;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        static {
            Options options = new Options(UInt.m886constructorimpl(1), null);
            withYear = options;
            Options options2 = new Options(UInt.m886constructorimpl(2), null);
            withMonth = options2;
            withWeekOfYear = new Options(UInt.m886constructorimpl(4), null);
            Options options3 = new Options(UInt.m886constructorimpl(16), null);
            withDay = options3;
            Options options4 = new Options(UInt.m886constructorimpl(32), null);
            withTime = options4;
            Options options5 = new Options(UInt.m886constructorimpl(64), null);
            withTimeZone = options5;
            withSpaceBetweenDateAndTime = new Options(UInt.m886constructorimpl(128), null);
            Options options6 = new Options(UInt.m886constructorimpl(256), null);
            withDashSeparatorInDate = options6;
            Options options7 = new Options(UInt.m886constructorimpl(Barcode.FORMAT_UPC_A), null);
            withColonSeparatorInTime = options7;
            Options options8 = new Options(UInt.m886constructorimpl(Barcode.FORMAT_UPC_E), null);
            withColonSeparatorInTimeZone = options8;
            withFractionalSeconds = new Options(UInt.m886constructorimpl(2048), null);
            Options options9 = new Options(UInt.m886constructorimpl(options6.getRawValue() + UInt.m886constructorimpl(options3.getRawValue() + UInt.m886constructorimpl(options2.getRawValue() + options.getRawValue()))), null);
            withFullDate = options9;
            Options options10 = new Options(UInt.m886constructorimpl(options8.getRawValue() + UInt.m886constructorimpl(options7.getRawValue() + UInt.m886constructorimpl(options5.getRawValue() + options4.getRawValue()))), null);
            withFullTime = options10;
            withInternetDateTime = new Options(UInt.m886constructorimpl(options10.getRawValue() + options9.getRawValue()), null);
        }

        private Options(MutableStruct mutableStruct) {
            mutableStruct.getClass();
            m1100setRawValueWZ4Q5Ns(((Options) mutableStruct).getRawValue());
        }

        public static final /* synthetic */ Options access$getWithColonSeparatorInTime$cp() {
            return withColonSeparatorInTime;
        }

        public static final /* synthetic */ Options access$getWithColonSeparatorInTimeZone$cp() {
            return withColonSeparatorInTimeZone;
        }

        public static final /* synthetic */ Options access$getWithDashSeparatorInDate$cp() {
            return withDashSeparatorInDate;
        }

        public static final /* synthetic */ Options access$getWithDay$cp() {
            return withDay;
        }

        public static final /* synthetic */ Options access$getWithFractionalSeconds$cp() {
            return withFractionalSeconds;
        }

        public static final /* synthetic */ Options access$getWithFullDate$cp() {
            return withFullDate;
        }

        public static final /* synthetic */ Options access$getWithFullTime$cp() {
            return withFullTime;
        }

        public static final /* synthetic */ Options access$getWithInternetDateTime$cp() {
            return withInternetDateTime;
        }

        public static final /* synthetic */ Options access$getWithMonth$cp() {
            return withMonth;
        }

        public static final /* synthetic */ Options access$getWithSpaceBetweenDateAndTime$cp() {
            return withSpaceBetweenDateAndTime;
        }

        public static final /* synthetic */ Options access$getWithTime$cp() {
            return withTime;
        }

        public static final /* synthetic */ Options access$getWithTimeZone$cp() {
            return withTimeZone;
        }

        public static final /* synthetic */ Options access$getWithWeekOfYear$cp() {
            return withWeekOfYear;
        }

        public static final /* synthetic */ Options access$getWithYear$cp() {
            return withYear;
        }

        private final void assignfrom(Options target) {
            m1100setRawValueWZ4Q5Ns(target.getRawValue());
        }

        /* renamed from: assignoptionset, reason: avoid collision after fix types in other method */
        public void assignoptionset2(Options target) {
            target.getClass();
            willmutate();
            try {
                assignfrom(target);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ boolean contains(Object obj) {
            return contains2((Options) obj);
        }

        @Override // skip.lib.MutableStruct
        public void didmutate() {
            super.didmutate();
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ void formIntersection(Options options) {
            formIntersection2(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ void formSymmetricDifference(Options options) {
            formSymmetricDifference2(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ void formUnion(Options options) {
            formUnion2(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* synthetic */ Object getRawValue() {
            return new UInt(getRawValue());
        }

        /* renamed from: getRawValue-pVg5ArA, reason: not valid java name and from getter */
        public int getRawValue() {
            return this.rawValue;
        }

        @Override // skip.lib.OptionSet
        /* renamed from: getRawvaluelong-s-VKNKU */
        public long mo1057getRawvaluelongsVKNKU() {
            return NumbersKt.m1353ULongWZ4Q5Ns(getRawValue());
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ Tuple2 insert(Object obj) {
            return insert2((Options) obj);
        }

        /* renamed from: intersection, reason: avoid collision after fix types in other method */
        public Options intersection2(Options options) {
            return (Options) super.intersection(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ boolean isDisjoint(Options options) {
            return isDisjoint2(options);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public boolean isEmpty() {
            return super.isEmpty();
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ boolean isStrictSubset(Options options) {
            return isStrictSubset2(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ boolean isStrictSuperset(Options options) {
            return isStrictSuperset2(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ boolean isSubset(Options options) {
            return isSubset2(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ boolean isSuperset(Options options) {
            return isSuperset2(options);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.OptionSet
        /* renamed from: makeoptionset-VKZWuLQ */
        public Options mo1058makeoptionsetVKZWuLQ(long rawvaluelong) {
            return new Options(NumbersKt.m1348UIntVKZWuLQ(rawvaluelong), null);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ Object remove(Object obj) {
            return remove2((Options) obj);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Options(this);
        }

        /* renamed from: setRawValue-WZ4Q5Ns, reason: not valid java name */
        public void m1100setRawValueWZ4Q5Ns(int i) {
            this.rawValue = i;
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        @Override // skip.lib.MutableStruct
        public void setSupdate(Function1<Object, Unit> function1) {
            this.supdate = function1;
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ void subtract(Options options) {
            subtract2(options);
        }

        /* renamed from: subtracting, reason: avoid collision after fix types in other method */
        public Options subtracting2(Options options) {
            return (Options) super.subtracting(options);
        }

        /* renamed from: symmetricDifference, reason: avoid collision after fix types in other method */
        public Options symmetricDifference2(Options options) {
            return (Options) super.symmetricDifference(options);
        }

        /* renamed from: union, reason: avoid collision after fix types in other method */
        public Options union2(Options options) {
            return (Options) super.union(options);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ Object update(Object obj) {
            return update2((Options) obj);
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\"\u001a\u00020\u00052\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050$\"\u00020\u0005¢\u0006\u0002\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007¨\u0006&"}, d2 = {"Lskip/foundation/ISO8601DateFormatter$Options$Companion;", "", "<init>", "()V", "withYear", "Lskip/foundation/ISO8601DateFormatter$Options;", "getWithYear", "()Lskip/foundation/ISO8601DateFormatter$Options;", "withMonth", "getWithMonth", "withWeekOfYear", "getWithWeekOfYear", "withDay", "getWithDay", "withTime", "getWithTime", "withTimeZone", "getWithTimeZone", "withSpaceBetweenDateAndTime", "getWithSpaceBetweenDateAndTime", "withDashSeparatorInDate", "getWithDashSeparatorInDate", "withColonSeparatorInTime", "getWithColonSeparatorInTime", "withColonSeparatorInTimeZone", "getWithColonSeparatorInTimeZone", "withFractionalSeconds", "getWithFractionalSeconds", "withFullDate", "getWithFullDate", "withFullTime", "getWithFullTime", "withInternetDateTime", "getWithInternetDateTime", "of", "options", "", "([Lskip/foundation/ISO8601DateFormatter$Options;)Lskip/foundation/ISO8601DateFormatter$Options;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Options getWithColonSeparatorInTime() {
                return Options.access$getWithColonSeparatorInTime$cp();
            }

            public final Options getWithColonSeparatorInTimeZone() {
                return Options.access$getWithColonSeparatorInTimeZone$cp();
            }

            public final Options getWithDashSeparatorInDate() {
                return Options.access$getWithDashSeparatorInDate$cp();
            }

            public final Options getWithDay() {
                return Options.access$getWithDay$cp();
            }

            public final Options getWithFractionalSeconds() {
                return Options.access$getWithFractionalSeconds$cp();
            }

            public final Options getWithFullDate() {
                return Options.access$getWithFullDate$cp();
            }

            public final Options getWithFullTime() {
                return Options.access$getWithFullTime$cp();
            }

            public final Options getWithInternetDateTime() {
                return Options.access$getWithInternetDateTime$cp();
            }

            public final Options getWithMonth() {
                return Options.access$getWithMonth$cp();
            }

            public final Options getWithSpaceBetweenDateAndTime() {
                return Options.access$getWithSpaceBetweenDateAndTime$cp();
            }

            public final Options getWithTime() {
                return Options.access$getWithTime$cp();
            }

            public final Options getWithTimeZone() {
                return Options.access$getWithTimeZone$cp();
            }

            public final Options getWithWeekOfYear() {
                return Options.access$getWithWeekOfYear$cp();
            }

            public final Options getWithYear() {
                return Options.access$getWithYear$cp();
            }

            public final Options of(Options... options) {
                options.getClass();
                int UInt = NumbersKt.UInt((Number) 0);
                for (Options options2 : options) {
                    UInt = UInt.m886constructorimpl(UInt | options2.getRawValue());
                }
                return new Options(UInt, null);
            }

            private Companion() {
            }
        }

        /* renamed from: formIntersection, reason: avoid collision after fix types in other method */
        public void formIntersection2(Options options) {
            super.formIntersection(options);
        }

        /* renamed from: formSymmetricDifference, reason: avoid collision after fix types in other method */
        public void formSymmetricDifference2(Options options) {
            super.formSymmetricDifference(options);
        }

        /* renamed from: formUnion, reason: avoid collision after fix types in other method */
        public void formUnion2(Options options) {
            super.formUnion(options);
        }

        /* renamed from: subtract, reason: avoid collision after fix types in other method */
        public void subtract2(Options options) {
            super.subtract(options);
        }

        /* renamed from: contains, reason: avoid collision after fix types in other method */
        public boolean contains2(Options options) {
            return super.contains(options);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ void formIntersection(SetAlgebra setAlgebra) {
            formIntersection2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ void formSymmetricDifference(SetAlgebra setAlgebra) {
            formSymmetricDifference2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ void formUnion(SetAlgebra setAlgebra) {
            formUnion2((Options) setAlgebra);
        }

        /* renamed from: insert, reason: avoid collision after fix types in other method */
        public Tuple2<Boolean, Options> insert2(Options options) {
            return super.insert(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ Options intersection(Options options) {
            return intersection2(options);
        }

        /* renamed from: isDisjoint, reason: avoid collision after fix types in other method */
        public boolean isDisjoint2(Options options) {
            return super.isDisjoint(options);
        }

        /* renamed from: isStrictSubset, reason: avoid collision after fix types in other method */
        public boolean isStrictSubset2(Options options) {
            return super.isStrictSubset(options);
        }

        /* renamed from: isStrictSuperset, reason: avoid collision after fix types in other method */
        public boolean isStrictSuperset2(Options options) {
            return super.isStrictSuperset(options);
        }

        /* renamed from: isSubset, reason: avoid collision after fix types in other method */
        public boolean isSubset2(Options options) {
            return super.isSubset(options);
        }

        /* renamed from: isSuperset, reason: avoid collision after fix types in other method */
        public boolean isSuperset2(Options options) {
            return super.isSuperset(options);
        }

        /* renamed from: remove, reason: avoid collision after fix types in other method */
        public Options remove2(Options options) {
            return (Options) super.remove(options);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ void subtract(SetAlgebra setAlgebra) {
            subtract2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ Options subtracting(Options options) {
            return subtracting2(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ Options symmetricDifference(Options options) {
            return symmetricDifference2(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ Options union(Options options) {
            return union2(options);
        }

        /* renamed from: update, reason: avoid collision after fix types in other method */
        public Options update2(Options options) {
            return (Options) super.update(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ boolean contains(Options options) {
            return contains2(options);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ Tuple2<Boolean, Options> insert(Options options) {
            return insert2(options);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ SetAlgebra intersection(SetAlgebra setAlgebra) {
            return intersection2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ boolean isDisjoint(SetAlgebra setAlgebra) {
            return isDisjoint2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ boolean isStrictSubset(SetAlgebra setAlgebra) {
            return isStrictSubset2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ boolean isStrictSuperset(SetAlgebra setAlgebra) {
            return isStrictSuperset2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ boolean isSubset(SetAlgebra setAlgebra) {
            return isSubset2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ boolean isSuperset(SetAlgebra setAlgebra) {
            return isSuperset2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ Options remove(Options options) {
            return remove2(options);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ SetAlgebra subtracting(SetAlgebra setAlgebra) {
            return subtracting2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ SetAlgebra symmetricDifference(SetAlgebra setAlgebra) {
            return symmetricDifference2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet, skip.lib.SetAlgebra
        public /* bridge */ /* synthetic */ SetAlgebra union(SetAlgebra setAlgebra) {
            return union2((Options) setAlgebra);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ Options update(Options options) {
            return update2(options);
        }

        @Override // skip.lib.OptionSet
        /* renamed from: makeoptionset-VKZWuLQ */
        public /* bridge */ /* synthetic */ Options mo1058makeoptionsetVKZWuLQ(long j) {
            return mo1058makeoptionsetVKZWuLQ(j);
        }

        private Options(int i) {
            m1100setRawValueWZ4Q5Ns(i);
        }

        public /* synthetic */ Options(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        @Override // skip.lib.OptionSet
        public /* bridge */ /* synthetic */ void assignoptionset(Options options) {
            assignoptionset2(options);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lskip/foundation/ISO8601DateFormatter$Companion;", "Lskip/foundation/ISO8601DateFormatter$CompanionClass;", "<init>", "()V", "string", "", TicketDetailDestinationKt.LAUNCHED_FROM, "Lskip/foundation/Date;", "timeZone", "Lskip/foundation/TimeZone;", "formatOptions", "Lskip/foundation/ISO8601DateFormatter$Options;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.ISO8601DateFormatter.CompanionClass
        public String string(Date from, TimeZone timeZone, Options formatOptions) {
            from.getClass();
            timeZone.getClass();
            formatOptions.getClass();
            ISO8601DateFormatter iSO8601DateFormatter = new ISO8601DateFormatter();
            iSO8601DateFormatter.setTimeZone(timeZone);
            iSO8601DateFormatter.setFormatOptions(formatOptions);
            return iSO8601DateFormatter.string(from);
        }

        private Companion() {
        }
    }

    @Override // skip.foundation.DateFormatter, skip.foundation.Formatter
    public String string(Object for_) {
        Date date = (Date) StructKt.sref$default(for_ instanceof Date ? (Date) for_ : null, null, 1, null);
        if (date == null) {
            return null;
        }
        return string(date);
    }
}
