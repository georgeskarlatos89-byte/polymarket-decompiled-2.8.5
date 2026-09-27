package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.common.config.model.Model;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"process", "Lcom/socure/docv/capturesdk/common/utils/ModelOutputs;", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "tensorBuffer", "Ljava/nio/ByteBuffer;", "capturesdk_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModelUtilsKt {
    public static final ModelOutputs process(Model model, ByteBuffer byteBuffer) {
        model.getClass();
        byteBuffer.getClass();
        ModelOutputs modelOutputs = new ModelOutputs(model.getModel(), model.getNumOfBuffers());
        model.getModel().runForMultipleInputsOutputs(new ByteBuffer[]{byteBuffer}, modelOutputs.getBuffers());
        return modelOutputs;
    }
}
