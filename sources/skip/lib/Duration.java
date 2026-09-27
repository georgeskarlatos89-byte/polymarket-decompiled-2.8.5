package skip.lib;

import defpackage.woa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001,B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dH\u0086\u0002J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001dH\u0086\u0002J\u0011\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0017H\u0086\u0002J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0017H\u0086\u0002J\u0011\u0010 \u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÂ\u0003J,\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010\u0019\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006-"}, d2 = {"Lskip/lib/Duration;", "", "seconds", "", "attoseconds", "tag", "", "<init>", "(JJLkotlin/Unit;)V", "secondsComponent", "attosecondsComponent", "(JJ)V", "getSeconds", "()J", "getAttoseconds", "Lkotlin/Unit;", "components", "Lskip/lib/Tuple2;", "getComponents", "()Lskip/lib/Tuple2;", "toNanoseconds", "toMilliseconds", "toDouble", "", "plus", "other", "minus", "div", "divisor", "", "times", "multiplier", "compareTo", "toString", "", "component1", "component2", "component3", "copy", "(JJLkotlin/Unit;)Lskip/lib/Duration;", "equals", "", "", "hashCode", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Duration implements Comparable<Duration> {
    public static final long ATTOSECONDS_PER_MICROSECOND = 1000000000000L;
    public static final long ATTOSECONDS_PER_MILLISECOND = 1000000000000000L;
    public static final long ATTOSECONDS_PER_NANOSECOND = 1000000000;
    public static final long ATTOSECONDS_PER_SECOND = 1000000000000000000L;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Duration zero;
    private final long attoseconds;
    private final long seconds;
    private final Unit tag;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        zero = Companion.access$create(companion, 0L, 0L);
    }

    public Duration(long j, long j2) {
        this((j2 / ATTOSECONDS_PER_SECOND) + j, j2 % ATTOSECONDS_PER_SECOND, Unit.INSTANCE);
    }

    public static final /* synthetic */ Duration access$getZero$cp() {
        return zero;
    }

    public static /* synthetic */ Duration copy$default(Duration duration, long j, long j2, Unit unit, int i, Object obj) {
        if ((i & 1) != 0) {
            j = duration.seconds;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = duration.attoseconds;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            unit = duration.tag;
        }
        return duration.copy(j3, j4, unit);
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Duration other) {
        other.getClass();
        int e = Intrinsics.e(this.seconds, other.seconds);
        if (e != 0) {
            return e;
        }
        return Intrinsics.e(this.attoseconds, other.attoseconds);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAttoseconds() {
        return this.attoseconds;
    }

    public final Duration copy(long seconds, long attoseconds, Unit tag) {
        tag.getClass();
        return new Duration(seconds, attoseconds, tag);
    }

    public final Duration div(int divisor) {
        return INSTANCE.nanoseconds(toNanoseconds() / divisor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) other;
        if (this.seconds == duration.seconds && this.attoseconds == duration.attoseconds && Intrinsics.areEqual(this.tag, duration.tag)) {
            return true;
        }
        return false;
    }

    public final long getAttoseconds() {
        return this.attoseconds;
    }

    public final Tuple2<Long, Long> getComponents() {
        return new Tuple2<>(Long.valueOf(this.seconds), Long.valueOf(this.attoseconds));
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return this.tag.hashCode() + woa.d(Long.hashCode(this.seconds) * 31, 31, this.attoseconds);
    }

    public final Duration minus(Duration other) {
        other.getClass();
        long j = this.attoseconds - other.attoseconds;
        long j2 = this.seconds - other.seconds;
        if (j < 0) {
            j += ATTOSECONDS_PER_SECOND;
            j2--;
        }
        return Companion.access$create(INSTANCE, j2, j);
    }

    public final Duration plus(Duration other) {
        other.getClass();
        long j = this.attoseconds + other.attoseconds;
        long j2 = this.seconds + other.seconds;
        if (j >= ATTOSECONDS_PER_SECOND) {
            j -= ATTOSECONDS_PER_SECOND;
            j2++;
        }
        return Companion.access$create(INSTANCE, j2, j);
    }

    public final Duration times(int multiplier) {
        return INSTANCE.nanoseconds(toNanoseconds() * multiplier);
    }

    public final double toDouble() {
        return (this.attoseconds / 1.0E18d) + this.seconds;
    }

    public final long toMilliseconds() {
        return (this.attoseconds / ATTOSECONDS_PER_MILLISECOND) + (this.seconds * 1000);
    }

    public final long toNanoseconds() {
        return (this.attoseconds / ATTOSECONDS_PER_NANOSECOND) + (this.seconds * ATTOSECONDS_PER_NANOSECOND);
    }

    public String toString() {
        return toDouble() + " seconds";
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lskip/lib/Duration$Companion;", "", "<init>", "()V", "ATTOSECONDS_PER_SECOND", "", "ATTOSECONDS_PER_MILLISECOND", "ATTOSECONDS_PER_MICROSECOND", "ATTOSECONDS_PER_NANOSECOND", "create", "Lskip/lib/Duration;", "seconds", "attoseconds", "zero", "getZero", "()Lskip/lib/Duration;", "", "", "milliseconds", "microseconds", "nanoseconds", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ Duration access$create(Companion companion, long j, long j2) {
            return companion.create(j, j2);
        }

        private final Duration create(long seconds, long attoseconds) {
            return new Duration(seconds, attoseconds, Unit.INSTANCE, null);
        }

        public final Duration getZero() {
            return Duration.access$getZero$cp();
        }

        public final Duration microseconds(double microseconds) {
            double d = microseconds / 1000000.0d;
            long j = (long) d;
            return create(j, (long) ((d - j) * 1.0E18d));
        }

        public final Duration milliseconds(double milliseconds) {
            double d = milliseconds / 1000.0d;
            long j = (long) d;
            return create(j, (long) ((d - j) * 1.0E18d));
        }

        public final Duration nanoseconds(int nanoseconds) {
            long j = nanoseconds;
            return create(j / Duration.ATTOSECONDS_PER_NANOSECOND, (j % Duration.ATTOSECONDS_PER_NANOSECOND) * Duration.ATTOSECONDS_PER_NANOSECOND);
        }

        public final Duration seconds(double seconds) {
            long j = (long) seconds;
            return create(j, (long) ((seconds - j) * 1.0E18d));
        }

        private Companion() {
        }

        public final Duration nanoseconds(long nanoseconds) {
            return create(nanoseconds / Duration.ATTOSECONDS_PER_NANOSECOND, (nanoseconds % Duration.ATTOSECONDS_PER_NANOSECOND) * Duration.ATTOSECONDS_PER_NANOSECOND);
        }

        public final Duration seconds(long seconds) {
            return create(seconds, 0L);
        }

        public final Duration seconds(int seconds) {
            return create(seconds, 0L);
        }

        public final Duration microseconds(long microseconds) {
            return create(microseconds / 1000000, (microseconds % 1000000) * Duration.ATTOSECONDS_PER_MICROSECOND);
        }

        public final Duration milliseconds(long milliseconds) {
            return create(milliseconds / 1000, (milliseconds % 1000) * Duration.ATTOSECONDS_PER_MILLISECOND);
        }

        public final Duration microseconds(int microseconds) {
            long j = microseconds;
            return create(j / 1000000, (j % 1000000) * Duration.ATTOSECONDS_PER_MICROSECOND);
        }

        public final Duration milliseconds(int milliseconds) {
            long j = milliseconds;
            return create(j / 1000, (j % 1000) * Duration.ATTOSECONDS_PER_MILLISECOND);
        }
    }

    public final Duration div(double divisor) {
        return INSTANCE.seconds(toDouble() / divisor);
    }

    public final Duration times(double multiplier) {
        return INSTANCE.seconds(toDouble() * multiplier);
    }

    private final void component3() {
    }

    private Duration(long j, long j2, Unit unit) {
        this.seconds = j;
        this.attoseconds = j2;
        this.tag = unit;
    }

    public /* synthetic */ Duration(long j, long j2, Unit unit, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, unit);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return compareTo2(duration);
    }
}
