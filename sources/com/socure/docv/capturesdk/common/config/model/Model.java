package com.socure.docv.capturesdk.common.config.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ix2;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.tensorflow.lite.Interpreter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/common/config/model/Model;", "", ConstantsKt.KEY_MODEL, "Lorg/tensorflow/lite/Interpreter;", "confidence", "", "numOfBuffers", "", "<init>", "(Lorg/tensorflow/lite/Interpreter;FI)V", "getModel", "()Lorg/tensorflow/lite/Interpreter;", "getConfidence", "()F", "getNumOfBuffers", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Model {
    public static final int $stable = 8;
    private final float confidence;
    private final Interpreter model;
    private final int numOfBuffers;

    public Model(Interpreter interpreter, float f, int i) {
        interpreter.getClass();
        this.model = interpreter;
        this.confidence = f;
        this.numOfBuffers = i;
    }

    public static /* synthetic */ Model copy$default(Model model, Interpreter interpreter, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interpreter = model.model;
        }
        if ((i2 & 2) != 0) {
            f = model.confidence;
        }
        if ((i2 & 4) != 0) {
            i = model.numOfBuffers;
        }
        return model.copy(interpreter, f, i);
    }

    /* renamed from: component1, reason: from getter */
    public final Interpreter getModel() {
        return this.model;
    }

    /* renamed from: component2, reason: from getter */
    public final float getConfidence() {
        return this.confidence;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNumOfBuffers() {
        return this.numOfBuffers;
    }

    public final Model copy(Interpreter model, float confidence, int numOfBuffers) {
        model.getClass();
        return new Model(model, confidence, numOfBuffers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Model)) {
            return false;
        }
        Model model = (Model) other;
        if (Intrinsics.areEqual(this.model, model.model) && Float.compare(this.confidence, model.confidence) == 0 && this.numOfBuffers == model.numOfBuffers) {
            return true;
        }
        return false;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final Interpreter getModel() {
        return this.model;
    }

    public final int getNumOfBuffers() {
        return this.numOfBuffers;
    }

    public int hashCode() {
        return Integer.hashCode(this.numOfBuffers) + sv6.a(this.model.hashCode() * 31, this.confidence, 31);
    }

    public String toString() {
        Interpreter interpreter = this.model;
        float f = this.confidence;
        int i = this.numOfBuffers;
        StringBuilder sb = new StringBuilder("Model(model=");
        sb.append(interpreter);
        sb.append(", confidence=");
        sb.append(f);
        sb.append(", numOfBuffers=");
        return ix2.i(i, ")", sb);
    }
}
