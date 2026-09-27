package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.common.config.model.ModelConfig;
import defpackage.dmk;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"numberOfBuffers", "", "Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "getNumberOfBuffers", "(Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;)I", "capturesdk_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModelConfigUtilsKt {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModelConfig.Type.values().length];
            try {
                iArr[ModelConfig.Type.BLUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModelConfig.Type.CORNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModelConfig.Type.GLARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ModelConfig.Type.GLARE_INTENSITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ModelConfig.Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getNumberOfBuffers(ModelConfig.Type type) {
        type.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i == 4 || i == 5) {
            return 1;
        }
        dmk.a();
        return 0;
    }
}
