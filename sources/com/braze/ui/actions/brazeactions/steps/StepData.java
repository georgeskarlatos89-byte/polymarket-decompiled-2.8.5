package com.braze.ui.actions.brazeactions.steps;

import com.appsflyer.AppsFlyerProperties;
import defpackage.ace;
import defpackage.b69;
import defpackage.dmk;
import defpackage.en1;
import defpackage.lnf;
import defpackage.lwg;
import defpackage.ml1;
import defpackage.pwg;
import defpackage.qga;
import defpackage.r18;
import defpackage.syh;
import defpackage.tj6;
import defpackage.ue3;
import defpackage.wnh;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000e\b\u0080\b\u0018\u0000 62\u00020\u0001:\u00016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00102\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u00101R\u001d\u00105\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u00101¨\u00067"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/StepData;", "", "Lorg/json/JSONObject;", "srcJson", "Lue3;", AppsFlyerProperties.CHANNEL, "<init>", "(Lorg/json/JSONObject;Lue3;)V", "", "index", "getArg$android_sdk_ui", "(I)Ljava/lang/Object;", "getArg", "Len1;", "coerceArgToPropertiesOrNull", "(I)Len1;", "fixedArgCount", "Lkotlin/ranges/IntRange;", "rangedArgCount", "", "isArgCountInBounds", "(ILkotlin/ranges/IntRange;)Z", "isArgString", "(I)Z", "isArgOptionalJsonObject", "", "toString", "()Ljava/lang/String;", "copy", "(Lorg/json/JSONObject;Lue3;)Lcom/braze/ui/actions/brazeactions/steps/StepData;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/json/JSONObject;", "getSrcJson", "()Lorg/json/JSONObject;", "Lue3;", "getChannel", "()Lue3;", "", "args$delegate", "Lkotlin/Lazy;", "getArgs", "()Ljava/util/List;", "args", "firstArg$delegate", "getFirstArg", "()Ljava/lang/Object;", "firstArg", "secondArg$delegate", "getSecondArg", "secondArg", "Companion", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StepData {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args;
    private final ue3 channel;

    /* renamed from: firstArg$delegate, reason: from kotlin metadata */
    private final Lazy firstArg;

    /* renamed from: secondArg$delegate, reason: from kotlin metadata */
    private final Lazy secondArg;
    private final JSONObject srcJson;

    public StepData(JSONObject jSONObject, ue3 ue3Var) {
        jSONObject.getClass();
        ue3Var.getClass();
        this.srcJson = jSONObject;
        this.channel = ue3Var;
        this.args = LazyKt.lazy(new ml1(3, this));
        this.firstArg = LazyKt.lazy(new ml1(4, this));
        this.secondArg = LazyKt.lazy(new ml1(5, this));
    }

    public static /* synthetic */ Object a(StepData stepData) {
        return secondArg_delegate$lambda$0(stepData);
    }

    private static final List args_delegate$lambda$0(StepData stepData) {
        Iterator tj6Var;
        final JSONArray optJSONArray = stepData.srcJson.optJSONArray("args");
        if (optJSONArray == null) {
            tj6Var = CollectionsKt.emptyList().iterator();
        } else {
            tj6Var = new tj6(pwg.n(new r18(CollectionsKt.r(lnf.k(0, optJSONArray.length())), true, new Function1<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$1
                public final Boolean invoke(int i) {
                    return Boolean.valueOf(Objects.nonNull(optJSONArray.opt(i)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }), new Function1<Integer, Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$2
                public final Object invoke(int i) {
                    Object obj = optJSONArray.get(i);
                    if (obj != null) {
                        return obj;
                    }
                    dmk.s("null cannot be cast to non-null type kotlin.Any");
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }));
        }
        return pwg.q(lwg.b(tj6Var));
    }

    public static /* synthetic */ String b(IntRange intRange, StepData stepData) {
        return isArgCountInBounds$lambda$1(intRange, stepData);
    }

    public static /* synthetic */ String c(int i, StepData stepData) {
        return isArgCountInBounds$lambda$0(i, stepData);
    }

    public static /* synthetic */ StepData copy$default(StepData stepData, JSONObject jSONObject, ue3 ue3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = stepData.srcJson;
        }
        if ((i & 2) != 0) {
            ue3Var = stepData.channel;
        }
        return stepData.copy(jSONObject, ue3Var);
    }

    public static /* synthetic */ String d(int i, StepData stepData) {
        return isArgString$lambda$0(i, stepData);
    }

    public static /* synthetic */ Object e(StepData stepData) {
        return firstArg_delegate$lambda$0(stepData);
    }

    public static /* synthetic */ String f(int i, StepData stepData) {
        return isArgOptionalJsonObject$lambda$0(i, stepData);
    }

    private static final Object firstArg_delegate$lambda$0(StepData stepData) {
        return stepData.getArg$android_sdk_ui(0);
    }

    public static /* synthetic */ List g(StepData stepData) {
        return args_delegate$lambda$0(stepData);
    }

    private final List<Object> getArgs() {
        return (List) this.args.getValue();
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i, IntRange intRange, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            intRange = null;
        }
        return stepData.isArgCountInBounds(i, intRange);
    }

    private static final String isArgCountInBounds$lambda$0(int i, StepData stepData) {
        StringBuilder o = ace.o(i, "Expected ", " arguments. Got: ");
        o.append(stepData.getArgs());
        return o.toString();
    }

    private static final String isArgCountInBounds$lambda$1(IntRange intRange, StepData stepData) {
        return "Expected " + intRange + " arguments. Got: " + stepData.getArgs();
    }

    private static final String isArgOptionalJsonObject$lambda$0(int i, StepData stepData) {
        StringBuilder o = ace.o(i, "Argument [", "] is not a JSONObject. Source: ");
        o.append(stepData.srcJson);
        return o.toString();
    }

    private static final String isArgString$lambda$0(int i, StepData stepData) {
        StringBuilder o = ace.o(i, "Argument [", "] is not a String. Source: ");
        o.append(stepData.srcJson);
        return o.toString();
    }

    private static final Object secondArg_delegate$lambda$0(StepData stepData) {
        return stepData.getArg$android_sdk_ui(1);
    }

    public final en1 coerceArgToPropertiesOrNull(int index) {
        Object J = CollectionsKt.J(index, getArgs());
        if (J != null && (J instanceof JSONObject)) {
            return new en1((JSONObject) J);
        }
        return null;
    }

    public final StepData copy(JSONObject srcJson, ue3 channel) {
        srcJson.getClass();
        channel.getClass();
        return new StepData(srcJson, channel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) other;
        if (Intrinsics.areEqual(this.srcJson, stepData.srcJson) && this.channel == stepData.channel) {
            return true;
        }
        return false;
    }

    public final Object getArg$android_sdk_ui(int index) {
        return CollectionsKt.J(index, getArgs());
    }

    public final ue3 getChannel() {
        return this.channel;
    }

    public final Object getFirstArg() {
        return this.firstArg.getValue();
    }

    public final Object getSecondArg() {
        return this.secondArg.getValue();
    }

    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    public int hashCode() {
        return this.channel.hashCode() + (this.srcJson.hashCode() * 31);
    }

    public final boolean isArgCountInBounds(int fixedArgCount, IntRange rangedArgCount) {
        if (fixedArgCount != -1 && getArgs().size() != fixedArgCount) {
            b69.h(this, null, null, false, new syh(fixedArgCount, this, 2), 7);
            return false;
        }
        if (rangedArgCount != null && !rangedArgCount.a(getArgs().size())) {
            b69.h(this, null, null, false, new wnh(9, rangedArgCount, this), 7);
            return false;
        }
        return true;
    }

    public final boolean isArgOptionalJsonObject(int index) {
        Object arg$android_sdk_ui = getArg$android_sdk_ui(index);
        if (arg$android_sdk_ui == null || (arg$android_sdk_ui instanceof JSONObject)) {
            return true;
        }
        b69.h(this, null, null, false, new syh(index, this, 1), 7);
        return false;
    }

    public final boolean isArgString(int index) {
        if (getArg$android_sdk_ui(index) instanceof String) {
            return true;
        }
        b69.h(this, null, null, false, new syh(index, this, 0), 7);
        return false;
    }

    public String toString() {
        return "Channel " + this.channel + " and json\n" + qga.e(this.srcJson);
    }

    public /* synthetic */ StepData(JSONObject jSONObject, ue3 ue3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? ue3.UNKNOWN : ue3Var);
    }
}
