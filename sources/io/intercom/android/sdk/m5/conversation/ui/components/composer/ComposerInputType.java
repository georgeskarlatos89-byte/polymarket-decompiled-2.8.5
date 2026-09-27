package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "", "Text", "VoiceNotes", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType$Text;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType$VoiceNotes;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerInputType {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType$Text;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Text implements ComposerInputType {
        public static final int $stable = 0;
        public static final Text INSTANCE = new Text();

        private Text() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Text)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 877964142;
        }

        public String toString() {
            return "Text";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType$VoiceNotes;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class VoiceNotes implements ComposerInputType {
        public static final int $stable = 0;
        public static final VoiceNotes INSTANCE = new VoiceNotes();

        private VoiceNotes() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof VoiceNotes)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -193831376;
        }

        public String toString() {
            return "VoiceNotes";
        }
    }
}
