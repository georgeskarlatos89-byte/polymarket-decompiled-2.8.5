package io.intercom.android.sdk.m5.conversation.states;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "", "<init>", "(Ljava/lang/String;I)V", "STANDALONE", "TOP", "MIDDLE", "BOTTOM", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GroupingPosition {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ GroupingPosition[] $VALUES;
    public static final GroupingPosition STANDALONE = new GroupingPosition("STANDALONE", 0);
    public static final GroupingPosition TOP = new GroupingPosition("TOP", 1);
    public static final GroupingPosition MIDDLE = new GroupingPosition("MIDDLE", 2);
    public static final GroupingPosition BOTTOM = new GroupingPosition("BOTTOM", 3);

    private static final /* synthetic */ GroupingPosition[] $values() {
        return new GroupingPosition[]{STANDALONE, TOP, MIDDLE, BOTTOM};
    }

    static {
        GroupingPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private GroupingPosition(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static GroupingPosition valueOf(String str) {
        return (GroupingPosition) Enum.valueOf(GroupingPosition.class, str);
    }

    public static GroupingPosition[] values() {
        return (GroupingPosition[]) $VALUES.clone();
    }
}
