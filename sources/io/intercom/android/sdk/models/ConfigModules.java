package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/models/ConfigModules;", "", "customization", "Lio/intercom/android/sdk/models/CustomizationModel;", "home", "Lio/intercom/android/sdk/models/HomeConfig;", "<init>", "(Lio/intercom/android/sdk/models/CustomizationModel;Lio/intercom/android/sdk/models/HomeConfig;)V", "getCustomization", "()Lio/intercom/android/sdk/models/CustomizationModel;", "getHome", "()Lio/intercom/android/sdk/models/HomeConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConfigModules {

    @SerializedName("customization")
    private final CustomizationModel customization;

    @SerializedName("home")
    private final HomeConfig home;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ConfigModules DEFAULT = new ConfigModules(new CustomizationModel(new CustomizationColorsModel("", "", null, null, null, null, 60, null), new CustomizationColorsModel("", "", null, null, null, null, 60, null), null, "", "", new CustomizationColorsModel("", "", null, null, null, null, 60, null), 0, null, null, "", null, 0, 4, null), null, 2, null);
    private static final ConfigModules DEFAULT_WITH_ACTION_COLORS = new ConfigModules(new CustomizationModel(new CustomizationColorsModel("#000000", "#FFFFFF", "#FFFFFF", null, null, null, 56, null), new CustomizationColorsModel("#000000", "#FAFAFA", null, null, null, null, 60, null), null, "", "", new CustomizationColorsModel("", "", null, null, null, null, 60, null), 0, null, null, "", null, 0, 4, null), null, 2, null);

    public /* synthetic */ ConfigModules(CustomizationModel customizationModel, HomeConfig homeConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(customizationModel, (i & 2) != 0 ? new HomeConfig(null, null, 3, null) : homeConfig);
    }

    public static final /* synthetic */ ConfigModules access$getDEFAULT$cp() {
        return DEFAULT;
    }

    public static final /* synthetic */ ConfigModules access$getDEFAULT_WITH_ACTION_COLORS$cp() {
        return DEFAULT_WITH_ACTION_COLORS;
    }

    public static /* synthetic */ ConfigModules copy$default(ConfigModules configModules, CustomizationModel customizationModel, HomeConfig homeConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            customizationModel = configModules.customization;
        }
        if ((i & 2) != 0) {
            homeConfig = configModules.home;
        }
        return configModules.copy(customizationModel, homeConfig);
    }

    public static final ConfigModules getDEFAULT_WITH_ACTION_COLORS() {
        return INSTANCE.getDEFAULT_WITH_ACTION_COLORS();
    }

    /* renamed from: component1, reason: from getter */
    public final CustomizationModel getCustomization() {
        return this.customization;
    }

    /* renamed from: component2, reason: from getter */
    public final HomeConfig getHome() {
        return this.home;
    }

    public final ConfigModules copy(CustomizationModel customization, HomeConfig home) {
        customization.getClass();
        home.getClass();
        return new ConfigModules(customization, home);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigModules)) {
            return false;
        }
        ConfigModules configModules = (ConfigModules) other;
        if (Intrinsics.areEqual(this.customization, configModules.customization) && Intrinsics.areEqual(this.home, configModules.home)) {
            return true;
        }
        return false;
    }

    public final CustomizationModel getCustomization() {
        return this.customization;
    }

    public final HomeConfig getHome() {
        return this.home;
    }

    public int hashCode() {
        return this.home.hashCode() + (this.customization.hashCode() * 31);
    }

    public String toString() {
        return "ConfigModules(customization=" + this.customization + ", home=" + this.home + ')';
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/models/ConfigModules$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/intercom/android/sdk/models/ConfigModules;", "getDEFAULT", "()Lio/intercom/android/sdk/models/ConfigModules;", "DEFAULT_WITH_ACTION_COLORS", "getDEFAULT_WITH_ACTION_COLORS$annotations", "getDEFAULT_WITH_ACTION_COLORS", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConfigModules getDEFAULT() {
            return ConfigModules.access$getDEFAULT$cp();
        }

        public final ConfigModules getDEFAULT_WITH_ACTION_COLORS() {
            return ConfigModules.access$getDEFAULT_WITH_ACTION_COLORS$cp();
        }

        private Companion() {
        }

        public static /* synthetic */ void getDEFAULT_WITH_ACTION_COLORS$annotations() {
        }
    }

    public ConfigModules(CustomizationModel customizationModel, HomeConfig homeConfig) {
        customizationModel.getClass();
        homeConfig.getClass();
        this.customization = customizationModel;
        this.home = homeConfig;
    }
}
