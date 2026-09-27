package io.getstream.chat.android.models;

import defpackage.c47;
import defpackage.d47;
import defpackage.h47;
import defpackage.m47;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016¨\u0006!"}, d2 = {"Lio/getstream/chat/android/models/TimeDuration;", "", "Ld47;", "duration", "<init>", "(J)V", "other", "", "compareTo", "(Lio/getstream/chat/android/models/TimeDuration;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "", "getMillis", "()J", "millis", "getSeconds", "seconds", "getMinutes", "minutes", "getHours", "hours", "getDays", "days", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeDuration implements Comparable<TimeDuration> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long duration;

    private TimeDuration(long j) {
        this.duration = j;
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(TimeDuration other) {
        other.getClass();
        return d47.c(this.duration, other.duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeDuration)) {
            return false;
        }
        return d47.d(this.duration, ((TimeDuration) other).duration);
    }

    public final long getDays() {
        long j = this.duration;
        c47 c47Var = d47.b;
        return d47.n(j, m47.DAYS);
    }

    public final long getHours() {
        long j = this.duration;
        c47 c47Var = d47.b;
        return d47.n(j, m47.HOURS);
    }

    public final long getMillis() {
        return d47.e(this.duration);
    }

    public final long getMinutes() {
        long j = this.duration;
        c47 c47Var = d47.b;
        return d47.n(j, m47.MINUTES);
    }

    public final long getSeconds() {
        long j = this.duration;
        c47 c47Var = d47.b;
        return d47.n(j, m47.SECONDS);
    }

    public int hashCode() {
        long j = this.duration;
        c47 c47Var = d47.b;
        return Long.hashCode(j);
    }

    public String toString() {
        return d47.o(this.duration);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, d2 = {"Lio/getstream/chat/android/models/TimeDuration$Companion;", "", "<init>", "()V", "millis", "Lio/getstream/chat/android/models/TimeDuration;", "", "seconds", "", "minutes", "hours", "days", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TimeDuration days(int days) {
            c47 c47Var = d47.b;
            return new TimeDuration(h47.g(days, m47.DAYS), null);
        }

        public final TimeDuration hours(int hours) {
            c47 c47Var = d47.b;
            return new TimeDuration(h47.g(hours, m47.HOURS), null);
        }

        public final TimeDuration millis(long millis) {
            c47 c47Var = d47.b;
            return new TimeDuration(h47.h(millis, m47.MILLISECONDS), null);
        }

        public final TimeDuration minutes(int minutes) {
            c47 c47Var = d47.b;
            return new TimeDuration(h47.g(minutes, m47.MINUTES), null);
        }

        public final TimeDuration seconds(int seconds) {
            c47 c47Var = d47.b;
            return new TimeDuration(h47.g(seconds, m47.SECONDS), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TimeDuration(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(TimeDuration timeDuration) {
        return compareTo2(timeDuration);
    }
}
