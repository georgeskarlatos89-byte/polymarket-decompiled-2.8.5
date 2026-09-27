package defpackage;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleRequestExtKt;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.ably.lib.transport.Defaults;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hdd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ hdd[] $VALUES;
    public static final hdd Backspace;
    public static final hdd Dot;
    public static final hdd Eight;
    public static final hdd Empty;
    public static final hdd Five;
    public static final hdd Four;
    public static final hdd Nine;
    public static final hdd One;
    public static final hdd Seven;
    public static final hdd Six;
    public static final hdd Three;
    public static final hdd Two;
    public static final hdd Zero;
    private final String rawValue;

    static {
        hdd hddVar = new hdd("Zero", 0, "0");
        Zero = hddVar;
        hdd hddVar2 = new hdd("One", 1, ModuleRequestExtKt.CAPTURE_DELTA);
        One = hddVar2;
        hdd hddVar3 = new hdd("Two", 2, "2");
        Two = hddVar3;
        hdd hddVar4 = new hdd("Three", 3, "3");
        Three = hddVar4;
        hdd hddVar5 = new hdd("Four", 4, "4");
        Four = hddVar5;
        hdd hddVar6 = new hdd("Five", 5, "5");
        Five = hddVar6;
        hdd hddVar7 = new hdd("Six", 6, Defaults.ABLY_PROTOCOL_VERSION);
        Six = hddVar7;
        hdd hddVar8 = new hdd("Seven", 7, "7");
        Seven = hddVar8;
        hdd hddVar9 = new hdd("Eight", 8, "8");
        Eight = hddVar9;
        hdd hddVar10 = new hdd("Nine", 9, "9");
        Nine = hddVar10;
        hdd hddVar11 = new hdd("Empty", 10, ApiConstant.SPACE);
        Empty = hddVar11;
        hdd hddVar12 = new hdd("Dot", 11, ".");
        Dot = hddVar12;
        hdd hddVar13 = new hdd("Backspace", 12, "backspace");
        Backspace = hddVar13;
        hdd[] hddVarArr = {hddVar, hddVar2, hddVar3, hddVar4, hddVar5, hddVar6, hddVar7, hddVar8, hddVar9, hddVar10, hddVar11, hddVar12, hddVar13};
        $VALUES = hddVarArr;
        $ENTRIES = new wg7(hddVarArr);
    }

    public hdd(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static hdd valueOf(String str) {
        return (hdd) Enum.valueOf(hdd.class, str);
    }

    public static hdd[] values() {
        return (hdd[]) $VALUES.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
