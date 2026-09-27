package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorLabels;", "", "errorText", "", "networkError", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorDetail;", "unknownError", "fileCountError", "fileSizeError", "fileTypeError", "<init>", "(Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorDetail;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorDetail;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorDetail;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorDetail;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorDetail;)V", "getErrorText", "()Ljava/lang/String;", "getNetworkError", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorDetail;", "getUnknownError", "getFileCountError", "getFileSizeError", "getFileTypeError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ModuleErrorLabels {
    public static final int $stable = 0;
    private final String errorText;
    private final ModuleErrorDetail fileCountError;
    private final ModuleErrorDetail fileSizeError;
    private final ModuleErrorDetail fileTypeError;
    private final ModuleErrorDetail networkError;
    private final ModuleErrorDetail unknownError;

    public /* synthetic */ ModuleErrorLabels(String str, ModuleErrorDetail moduleErrorDetail, ModuleErrorDetail moduleErrorDetail2, ModuleErrorDetail moduleErrorDetail3, ModuleErrorDetail moduleErrorDetail4, ModuleErrorDetail moduleErrorDetail5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : moduleErrorDetail, (i & 4) != 0 ? null : moduleErrorDetail2, (i & 8) != 0 ? null : moduleErrorDetail3, (i & 16) != 0 ? null : moduleErrorDetail4, (i & 32) != 0 ? null : moduleErrorDetail5);
    }

    public static /* synthetic */ ModuleErrorLabels copy$default(ModuleErrorLabels moduleErrorLabels, String str, ModuleErrorDetail moduleErrorDetail, ModuleErrorDetail moduleErrorDetail2, ModuleErrorDetail moduleErrorDetail3, ModuleErrorDetail moduleErrorDetail4, ModuleErrorDetail moduleErrorDetail5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleErrorLabels.errorText;
        }
        if ((i & 2) != 0) {
            moduleErrorDetail = moduleErrorLabels.networkError;
        }
        if ((i & 4) != 0) {
            moduleErrorDetail2 = moduleErrorLabels.unknownError;
        }
        if ((i & 8) != 0) {
            moduleErrorDetail3 = moduleErrorLabels.fileCountError;
        }
        if ((i & 16) != 0) {
            moduleErrorDetail4 = moduleErrorLabels.fileSizeError;
        }
        if ((i & 32) != 0) {
            moduleErrorDetail5 = moduleErrorLabels.fileTypeError;
        }
        ModuleErrorDetail moduleErrorDetail6 = moduleErrorDetail4;
        ModuleErrorDetail moduleErrorDetail7 = moduleErrorDetail5;
        return moduleErrorLabels.copy(str, moduleErrorDetail, moduleErrorDetail2, moduleErrorDetail3, moduleErrorDetail6, moduleErrorDetail7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    /* renamed from: component2, reason: from getter */
    public final ModuleErrorDetail getNetworkError() {
        return this.networkError;
    }

    /* renamed from: component3, reason: from getter */
    public final ModuleErrorDetail getUnknownError() {
        return this.unknownError;
    }

    /* renamed from: component4, reason: from getter */
    public final ModuleErrorDetail getFileCountError() {
        return this.fileCountError;
    }

    /* renamed from: component5, reason: from getter */
    public final ModuleErrorDetail getFileSizeError() {
        return this.fileSizeError;
    }

    /* renamed from: component6, reason: from getter */
    public final ModuleErrorDetail getFileTypeError() {
        return this.fileTypeError;
    }

    public final ModuleErrorLabels copy(String errorText, ModuleErrorDetail networkError, ModuleErrorDetail unknownError, ModuleErrorDetail fileCountError, ModuleErrorDetail fileSizeError, ModuleErrorDetail fileTypeError) {
        return new ModuleErrorLabels(errorText, networkError, unknownError, fileCountError, fileSizeError, fileTypeError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleErrorLabels)) {
            return false;
        }
        ModuleErrorLabels moduleErrorLabels = (ModuleErrorLabels) other;
        if (Intrinsics.areEqual(this.errorText, moduleErrorLabels.errorText) && Intrinsics.areEqual(this.networkError, moduleErrorLabels.networkError) && Intrinsics.areEqual(this.unknownError, moduleErrorLabels.unknownError) && Intrinsics.areEqual(this.fileCountError, moduleErrorLabels.fileCountError) && Intrinsics.areEqual(this.fileSizeError, moduleErrorLabels.fileSizeError) && Intrinsics.areEqual(this.fileTypeError, moduleErrorLabels.fileTypeError)) {
            return true;
        }
        return false;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    public final ModuleErrorDetail getFileCountError() {
        return this.fileCountError;
    }

    public final ModuleErrorDetail getFileSizeError() {
        return this.fileSizeError;
    }

    public final ModuleErrorDetail getFileTypeError() {
        return this.fileTypeError;
    }

    public final ModuleErrorDetail getNetworkError() {
        return this.networkError;
    }

    public final ModuleErrorDetail getUnknownError() {
        return this.unknownError;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.errorText;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        ModuleErrorDetail moduleErrorDetail = this.networkError;
        if (moduleErrorDetail == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = moduleErrorDetail.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ModuleErrorDetail moduleErrorDetail2 = this.unknownError;
        if (moduleErrorDetail2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = moduleErrorDetail2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ModuleErrorDetail moduleErrorDetail3 = this.fileCountError;
        if (moduleErrorDetail3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = moduleErrorDetail3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        ModuleErrorDetail moduleErrorDetail4 = this.fileSizeError;
        if (moduleErrorDetail4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = moduleErrorDetail4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        ModuleErrorDetail moduleErrorDetail5 = this.fileTypeError;
        if (moduleErrorDetail5 != null) {
            i = moduleErrorDetail5.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "ModuleErrorLabels(errorText=" + this.errorText + ", networkError=" + this.networkError + ", unknownError=" + this.unknownError + ", fileCountError=" + this.fileCountError + ", fileSizeError=" + this.fileSizeError + ", fileTypeError=" + this.fileTypeError + ")";
    }

    public ModuleErrorLabels(String str, ModuleErrorDetail moduleErrorDetail, ModuleErrorDetail moduleErrorDetail2, ModuleErrorDetail moduleErrorDetail3, ModuleErrorDetail moduleErrorDetail4, ModuleErrorDetail moduleErrorDetail5) {
        this.errorText = str;
        this.networkError = moduleErrorDetail;
        this.unknownError = moduleErrorDetail2;
        this.fileCountError = moduleErrorDetail3;
        this.fileSizeError = moduleErrorDetail4;
        this.fileTypeError = moduleErrorDetail5;
    }

    public ModuleErrorLabels() {
        this(null, null, null, null, null, null, 63, null);
    }
}
