package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.common.config.model.ModelConfig;
import defpackage.d1c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001aQ\u0010\n\u001a\u00020\t*2\u0012\u0004\u0012\u00020\u0001\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001aQ\u0010\n\u001a\u00020\t*2\u0012\u0004\u0012\u00020\u0001\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\r\u001aI\u0010\u000e\u001a\u00020\u0005*2\u0012\u0004\u0012\u00020\u0001\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f*j\u0010\u0010\"2\u0012\u0004\u0012\u00020\u0001\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00020\u000022\u0012\u0004\u0012\u00020\u0001\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00020\u0000¨\u0006\u0011"}, d2 = {"", "Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "Lkotlin/Triple;", "Lcom/socure/docv/capturesdk/core/storage/a;", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "", "Lcom/socure/docv/capturesdk/core/provider/interfaces/d;", "type", "confidence", "", "cache", "(Ljava/util/Map;Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;F)V", ConstantsKt.KEY_MODEL, "(Ljava/util/Map;Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;Lcom/socure/docv/capturesdk/common/config/model/Model;)V", "getConfidence", "(Ljava/util/Map;Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;)F", "DynamicModelDependencies", "capturesdk_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DynamicModelDependenciesUtilsKt {
    public static final void cache(Map<ModelConfig.Type, ? extends Triple<? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.provider.interfaces.d>> map, ModelConfig.Type type, float f) {
        com.socure.docv.capturesdk.core.storage.a second;
        map.getClass();
        type.getClass();
        Triple<? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.provider.interfaces.d> triple = map.get(type);
        if (triple != null && (second = triple.getSecond()) != null) {
            second.a = Float.valueOf(f);
        }
    }

    public static final float getConfidence(Map<ModelConfig.Type, ? extends Triple<? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.provider.interfaces.d>> map, ModelConfig.Type type) {
        map.getClass();
        type.getClass();
        return ((Number) ((com.socure.docv.capturesdk.core.provider.interfaces.d) ((Triple) d1c.c(map, type)).getThird()).get()).floatValue();
    }

    public static final void cache(Map<ModelConfig.Type, ? extends Triple<? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.provider.interfaces.d>> map, ModelConfig.Type type, Model model) {
        com.socure.docv.capturesdk.core.storage.a first;
        map.getClass();
        type.getClass();
        model.getClass();
        Triple<? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.storage.a, ? extends com.socure.docv.capturesdk.core.provider.interfaces.d> triple = map.get(type);
        if (triple == null || (first = triple.getFirst()) == null) {
            return;
        }
        first.a = model;
    }
}
