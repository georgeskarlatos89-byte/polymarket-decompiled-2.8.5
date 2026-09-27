package com.socure.idplus.device.internal.behavior.model;

import defpackage.ug7;
import defpackage.ww4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/InputChangeAction;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "CUT", "PASTE", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InputChangeAction {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ InputChangeAction[] $VALUES;
    public static final InputChangeAction UNKNOWN = new InputChangeAction("UNKNOWN", 0);
    public static final InputChangeAction CUT = new InputChangeAction("CUT", 1);
    public static final InputChangeAction PASTE = new InputChangeAction("PASTE", 2);

    private static final /* synthetic */ InputChangeAction[] $values() {
        return new InputChangeAction[]{UNKNOWN, CUT, PASTE};
    }

    static {
        InputChangeAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private InputChangeAction(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static InputChangeAction valueOf(String str) {
        return (InputChangeAction) Enum.valueOf(InputChangeAction.class, str);
    }

    public static InputChangeAction[] values() {
        return (InputChangeAction[]) $VALUES.clone();
    }
}
