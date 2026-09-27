package com.polymarket.apputil;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/apputil/DateFormatters;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AppUtil"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DateFormatters {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ DateFormatters[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ DateFormatters[] $values() {
        return new DateFormatters[0];
    }

    static {
        DateFormatters[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private DateFormatters(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static DateFormatters valueOf(String str) {
        return (DateFormatters) Enum.valueOf(DateFormatters.class, str);
    }

    public static DateFormatters[] values() {
        return (DateFormatters[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 ¨\u0006\r"}, d2 = {"Lcom/polymarket/apputil/DateFormatters$Companion;", "", "<init>", "()V", "relativeText", "", AttributeType.DATE, "Ljava/util/Date;", "Swift_Companion_relativeText_0", "relativeCompactText", "Swift_Companion_relativeCompactText_1", "relativeDayTimeText", "Swift_Companion_relativeDayTimeText_2", "AppUtil"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_relativeCompactText_1(Date date);

        private final native String Swift_Companion_relativeDayTimeText_2(Date date);

        private final native String Swift_Companion_relativeText_0(Date date);

        public final String relativeCompactText(Date date) {
            date.getClass();
            return Swift_Companion_relativeCompactText_1(date);
        }

        public final String relativeDayTimeText(Date date) {
            date.getClass();
            return Swift_Companion_relativeDayTimeText_2(date);
        }

        public final String relativeText(Date date) {
            date.getClass();
            return Swift_Companion_relativeText_0(date);
        }

        private Companion() {
        }
    }
}
