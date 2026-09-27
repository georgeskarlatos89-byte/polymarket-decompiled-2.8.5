package io.intercom.android.sdk.ui.component;

import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", "", "TextButton", "TopBarButton", "None", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$None;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$TextButton;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$TopBarButton;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MediaPickerButtonCTAStyle {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$None;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class None implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof None)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1542232760;
        }

        public String toString() {
            return "None";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$TextButton;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", "ctaText", "", "<init>", "(Ljava/lang/String;)V", "getCtaText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class TextButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        private final String ctaText;

        public TextButton(String str) {
            str.getClass();
            this.ctaText = str;
        }

        public static /* synthetic */ TextButton copy$default(TextButton textButton, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textButton.ctaText;
            }
            return textButton.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        public final TextButton copy(String ctaText) {
            ctaText.getClass();
            return new TextButton(ctaText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof TextButton) && Intrinsics.areEqual(this.ctaText, ((TextButton) other).ctaText)) {
                return true;
            }
            return false;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public int hashCode() {
            return this.ctaText.hashCode();
        }

        public String toString() {
            return m51.m(new StringBuilder("TextButton(ctaText="), this.ctaText, ')');
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$TopBarButton;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class TopBarButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        public static final TopBarButton INSTANCE = new TopBarButton();

        private TopBarButton() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof TopBarButton)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1620873520;
        }

        public String toString() {
            return "TopBarButton";
        }
    }
}
