package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import skip.lib.CodingKey;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class due implements CodingKey {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ due[] $VALUES;
    public static final due app;
    public static final due app_version;
    public static final due auth_grant;
    public static final due build_number;
    public static final due contract_version;
    public static final due environment;
    public static final due language;
    public static final due platform;
    public static final due theme;
    private final String rawValue;

    static {
        due dueVar = new due("contract_version", 0, "contract_version");
        contract_version = dueVar;
        due dueVar2 = new due("platform", 1, "platform");
        platform = dueVar2;
        due dueVar3 = new due("app", 2, "app");
        app = dueVar3;
        due dueVar4 = new due("auth_grant", 3, "auth_grant");
        auth_grant = dueVar4;
        due dueVar5 = new due("theme", 4, "theme");
        theme = dueVar5;
        due dueVar6 = new due(ConstantsKt.ENV_FACING_MODE, 5, ConstantsKt.ENV_FACING_MODE);
        environment = dueVar6;
        due dueVar7 = new due("app_version", 6, "app_version");
        app_version = dueVar7;
        due dueVar8 = new due("build_number", 7, "build_number");
        build_number = dueVar8;
        due dueVar9 = new due(Keys.KEY_LANGUAGE, 8, Keys.KEY_LANGUAGE);
        language = dueVar9;
        due[] dueVarArr = {dueVar, dueVar2, dueVar3, dueVar4, dueVar5, dueVar6, dueVar7, dueVar8, dueVar9};
        $VALUES = dueVarArr;
        $ENTRIES = new wg7(dueVarArr);
    }

    public due(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static due valueOf(String str) {
        return (due) Enum.valueOf(due.class, str);
    }

    public static due[] values() {
        return (due[]) $VALUES.clone();
    }

    @Override // skip.lib.CodingKey, skip.lib.CustomDebugStringConvertible
    public final String getDebugDescription() {
        return this.rawValue;
    }

    @Override // skip.lib.CodingKey
    public final String getDescription() {
        return this.rawValue;
    }

    @Override // skip.lib.CodingKey
    public final Integer getIntValue() {
        return null;
    }

    @Override // skip.lib.CodingKey
    public final String getRawValue() {
        return this.rawValue;
    }

    @Override // skip.lib.CodingKey
    public final String getStringValue() {
        return this.rawValue;
    }
}
