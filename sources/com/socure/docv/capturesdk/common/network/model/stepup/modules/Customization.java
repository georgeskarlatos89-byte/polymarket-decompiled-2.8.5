package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "", "theme", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "logo", "", "isLogoCustomized", "", "config", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "<init>", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;Ljava/lang/String;Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;)V", "getTheme", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "getLogo", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "component1", "component2", "component3", "component4", "copy", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;Ljava/lang/String;Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "equals", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class Customization {
    public static final int $stable = 0;
    private final Config config;
    private final Boolean isLogoCustomized;
    private final String logo;
    private final Theme theme;

    public Customization(Theme theme, String str, Boolean bool, Config config) {
        this.theme = theme;
        this.logo = str;
        this.isLogoCustomized = bool;
        this.config = config;
    }

    public static /* synthetic */ Customization copy$default(Customization customization, Theme theme, String str, Boolean bool, Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            theme = customization.theme;
        }
        if ((i & 2) != 0) {
            str = customization.logo;
        }
        if ((i & 4) != 0) {
            bool = customization.isLogoCustomized;
        }
        if ((i & 8) != 0) {
            config = customization.config;
        }
        return customization.copy(theme, str, bool, config);
    }

    /* renamed from: component1, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsLogoCustomized() {
        return this.isLogoCustomized;
    }

    /* renamed from: component4, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    public final Customization copy(Theme theme, String logo, Boolean isLogoCustomized, Config config) {
        return new Customization(theme, logo, isLogoCustomized, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Customization)) {
            return false;
        }
        Customization customization = (Customization) other;
        if (Intrinsics.areEqual(this.theme, customization.theme) && Intrinsics.areEqual(this.logo, customization.logo) && Intrinsics.areEqual(this.isLogoCustomized, customization.isLogoCustomized) && Intrinsics.areEqual(this.config, customization.config)) {
            return true;
        }
        return false;
    }

    public final Config getConfig() {
        return this.config;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Theme theme = this.theme;
        int i = 0;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.logo;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.isLogoCustomized;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Config config = this.config;
        if (config != null) {
            i = config.hashCode();
        }
        return i4 + i;
    }

    public final Boolean isLogoCustomized() {
        return this.isLogoCustomized;
    }

    public String toString() {
        return "Customization(theme=" + this.theme + ", logo=" + this.logo + ", isLogoCustomized=" + this.isLogoCustomized + ", config=" + this.config + ")";
    }
}
