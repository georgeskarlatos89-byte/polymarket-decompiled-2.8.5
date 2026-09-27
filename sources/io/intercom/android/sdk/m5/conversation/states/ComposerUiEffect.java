package io.intercom.android.sdk.m5.conversation.states;

import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect;", "", "<init>", "()V", "ReportAiAnswer", "UpdateTranscribedText", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect$ReportAiAnswer;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect$UpdateTranscribedText;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ComposerUiEffect {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect$ReportAiAnswer;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ReportAiAnswer extends ComposerUiEffect {
        public static final int $stable = 0;
        public static final ReportAiAnswer INSTANCE = new ReportAiAnswer();

        private ReportAiAnswer() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect$UpdateTranscribedText;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class UpdateTranscribedText extends ComposerUiEffect {
        public static final int $stable = 0;
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateTranscribedText(String str) {
            super(null);
            str.getClass();
            this.text = str;
        }

        public static /* synthetic */ UpdateTranscribedText copy$default(UpdateTranscribedText updateTranscribedText, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateTranscribedText.text;
            }
            return updateTranscribedText.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final UpdateTranscribedText copy(String text) {
            text.getClass();
            return new UpdateTranscribedText(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof UpdateTranscribedText) && Intrinsics.areEqual(this.text, ((UpdateTranscribedText) other).text)) {
                return true;
            }
            return false;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return m51.m(new StringBuilder("UpdateTranscribedText(text="), this.text, ')');
        }
    }

    public /* synthetic */ ComposerUiEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ComposerUiEffect() {
    }
}
