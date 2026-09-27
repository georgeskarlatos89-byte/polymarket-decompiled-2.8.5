package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.models.Weight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/EventLabelSegment;", "", "text", "", "weight", "Lio/intercom/android/sdk/models/Weight;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/models/Weight;)V", "getText", "()Ljava/lang/String;", "getWeight", "()Lio/intercom/android/sdk/models/Weight;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EventLabelSegment {
    public static final int $stable = 0;
    private final String text;
    private final Weight weight;

    public EventLabelSegment(String str, Weight weight) {
        str.getClass();
        this.text = str;
        this.weight = weight;
    }

    public static /* synthetic */ EventLabelSegment copy$default(EventLabelSegment eventLabelSegment, String str, Weight weight, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventLabelSegment.text;
        }
        if ((i & 2) != 0) {
            weight = eventLabelSegment.weight;
        }
        return eventLabelSegment.copy(str, weight);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Weight getWeight() {
        return this.weight;
    }

    public final EventLabelSegment copy(String text, Weight weight) {
        text.getClass();
        return new EventLabelSegment(text, weight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventLabelSegment)) {
            return false;
        }
        EventLabelSegment eventLabelSegment = (EventLabelSegment) other;
        if (Intrinsics.areEqual(this.text, eventLabelSegment.text) && this.weight == eventLabelSegment.weight) {
            return true;
        }
        return false;
    }

    public final String getText() {
        return this.text;
    }

    public final Weight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.text.hashCode() * 31;
        Weight weight = this.weight;
        if (weight == null) {
            hashCode = 0;
        } else {
            hashCode = weight.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "EventLabelSegment(text=" + this.text + ", weight=" + this.weight + ')';
    }

    public /* synthetic */ EventLabelSegment(String str, Weight weight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : weight);
    }
}
