package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "", "imageThemeColor", "", "progressBar", "", "removeIdCheckLogo", "swapPrimarySecondaryButtons", "replaceCompletionIconWithLoading", "simplifiedImageUploadUX", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getImageThemeColor", "()Ljava/lang/String;", "getProgressBar", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRemoveIdCheckLogo", "getSwapPrimarySecondaryButtons", "getReplaceCompletionIconWithLoading", "getSimplifiedImageUploadUX", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "equals", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class Config {
    public static final int $stable = 0;
    private final String imageThemeColor;
    private final Boolean progressBar;
    private final Boolean removeIdCheckLogo;
    private final Boolean replaceCompletionIconWithLoading;
    private final Boolean simplifiedImageUploadUX;
    private final Boolean swapPrimarySecondaryButtons;

    public Config(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.imageThemeColor = str;
        this.progressBar = bool;
        this.removeIdCheckLogo = bool2;
        this.swapPrimarySecondaryButtons = bool3;
        this.replaceCompletionIconWithLoading = bool4;
        this.simplifiedImageUploadUX = bool5;
    }

    public static /* synthetic */ Config copy$default(Config config, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = config.imageThemeColor;
        }
        if ((i & 2) != 0) {
            bool = config.progressBar;
        }
        if ((i & 4) != 0) {
            bool2 = config.removeIdCheckLogo;
        }
        if ((i & 8) != 0) {
            bool3 = config.swapPrimarySecondaryButtons;
        }
        if ((i & 16) != 0) {
            bool4 = config.replaceCompletionIconWithLoading;
        }
        if ((i & 32) != 0) {
            bool5 = config.simplifiedImageUploadUX;
        }
        Boolean bool6 = bool4;
        Boolean bool7 = bool5;
        return config.copy(str, bool, bool2, bool3, bool6, bool7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageThemeColor() {
        return this.imageThemeColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getProgressBar() {
        return this.progressBar;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getRemoveIdCheckLogo() {
        return this.removeIdCheckLogo;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getSwapPrimarySecondaryButtons() {
        return this.swapPrimarySecondaryButtons;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getReplaceCompletionIconWithLoading() {
        return this.replaceCompletionIconWithLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getSimplifiedImageUploadUX() {
        return this.simplifiedImageUploadUX;
    }

    public final Config copy(String imageThemeColor, Boolean progressBar, Boolean removeIdCheckLogo, Boolean swapPrimarySecondaryButtons, Boolean replaceCompletionIconWithLoading, Boolean simplifiedImageUploadUX) {
        return new Config(imageThemeColor, progressBar, removeIdCheckLogo, swapPrimarySecondaryButtons, replaceCompletionIconWithLoading, simplifiedImageUploadUX);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        if (Intrinsics.areEqual(this.imageThemeColor, config.imageThemeColor) && Intrinsics.areEqual(this.progressBar, config.progressBar) && Intrinsics.areEqual(this.removeIdCheckLogo, config.removeIdCheckLogo) && Intrinsics.areEqual(this.swapPrimarySecondaryButtons, config.swapPrimarySecondaryButtons) && Intrinsics.areEqual(this.replaceCompletionIconWithLoading, config.replaceCompletionIconWithLoading) && Intrinsics.areEqual(this.simplifiedImageUploadUX, config.simplifiedImageUploadUX)) {
            return true;
        }
        return false;
    }

    public final String getImageThemeColor() {
        return this.imageThemeColor;
    }

    public final Boolean getProgressBar() {
        return this.progressBar;
    }

    public final Boolean getRemoveIdCheckLogo() {
        return this.removeIdCheckLogo;
    }

    public final Boolean getReplaceCompletionIconWithLoading() {
        return this.replaceCompletionIconWithLoading;
    }

    public final Boolean getSimplifiedImageUploadUX() {
        return this.simplifiedImageUploadUX;
    }

    public final Boolean getSwapPrimarySecondaryButtons() {
        return this.swapPrimarySecondaryButtons;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.imageThemeColor;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.progressBar;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool2 = this.removeIdCheckLogo;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool3 = this.swapPrimarySecondaryButtons;
        if (bool3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Boolean bool4 = this.replaceCompletionIconWithLoading;
        if (bool4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Boolean bool5 = this.simplifiedImageUploadUX;
        if (bool5 != null) {
            i = bool5.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        String str = this.imageThemeColor;
        Boolean bool = this.progressBar;
        Boolean bool2 = this.removeIdCheckLogo;
        Boolean bool3 = this.swapPrimarySecondaryButtons;
        Boolean bool4 = this.replaceCompletionIconWithLoading;
        Boolean bool5 = this.simplifiedImageUploadUX;
        StringBuilder sb = new StringBuilder("Config(imageThemeColor=");
        sb.append(str);
        sb.append(", progressBar=");
        sb.append(bool);
        sb.append(", removeIdCheckLogo=");
        hdi.A(sb, bool2, ", swapPrimarySecondaryButtons=", bool3, ", replaceCompletionIconWithLoading=");
        sb.append(bool4);
        sb.append(", simplifiedImageUploadUX=");
        sb.append(bool5);
        sb.append(")");
        return sb.toString();
    }
}
