package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.polymarket.android.R;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.dmk;
import defpackage.h8i;
import defpackage.m4n;
import defpackage.mr1;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u0010(\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001a\u0010.\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001eR\u001a\u00104\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0011\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010?\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010B\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u0014\u0010E\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "Landroid/widget/LinearLayout;", "", "indicatorResId", "", "setInfoTextIndicator", "(I)V", "Landroid/view/View$OnClickListener;", "listener", "setSubmitButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "setResendButtonClickListener", "", "checked", "setWhitelistChecked", "(Z)V", "Landroid/view/View;", "challengeEntryView", "setChallengeEntryView", "(Landroid/view/View;)V", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "a", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "getInfoHeader$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "infoHeader", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "b", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "infoTextView", "c", "getInfoLabelView$3ds2sdk_release", "infoLabelView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", d.d, "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "getSubmitButton$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "submitButton", "e", "getResendButton$3ds2sdk_release", "resendButton", "f", "getWhitelistingLabel$3ds2sdk_release", "whitelistingLabel", "Landroid/widget/RadioGroup;", "g", "Landroid/widget/RadioGroup;", "getWhitelistRadioGroup$3ds2sdk_release", "()Landroid/widget/RadioGroup;", "whitelistRadioGroup", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "getChallengeEntryView$3ds2sdk_release", "()Landroid/widget/FrameLayout;", "Landroid/widget/RadioButton;", "i", "Landroid/widget/RadioButton;", "getWhitelistYesRadioButton$3ds2sdk_release", "()Landroid/widget/RadioButton;", "whitelistYesRadioButton", "j", "getWhitelistNoRadioButton$3ds2sdk_release", "whitelistNoRadioButton", "getWhitelistingSelection$3ds2sdk_release", "()Z", "whitelistingSelection", "3ds2sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChallengeZoneView extends LinearLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final ThreeDS2HeaderTextView infoHeader;

    /* renamed from: b, reason: from kotlin metadata */
    public final ThreeDS2TextView infoTextView;

    /* renamed from: c, reason: from kotlin metadata */
    public final ThreeDS2TextView infoLabelView;

    /* renamed from: d, reason: from kotlin metadata */
    public final ThreeDS2Button submitButton;

    /* renamed from: e, reason: from kotlin metadata */
    public final ThreeDS2Button resendButton;

    /* renamed from: f, reason: from kotlin metadata */
    public final ThreeDS2TextView whitelistingLabel;

    /* renamed from: g, reason: from kotlin metadata */
    public final RadioGroup whitelistRadioGroup;

    /* renamed from: h, reason: from kotlin metadata */
    public final FrameLayout challengeEntryView;

    /* renamed from: i, reason: from kotlin metadata */
    public final RadioButton whitelistYesRadioButton;

    /* renamed from: j, reason: from kotlin metadata */
    public final RadioButton whitelistNoRadioButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.stripe_challenge_zone_view, this);
        int i = R.id.czv_entry_view;
        FrameLayout frameLayout = (FrameLayout) m4n.d(this, R.id.czv_entry_view);
        if (frameLayout != null) {
            i = R.id.czv_header;
            ThreeDS2HeaderTextView threeDS2HeaderTextView = (ThreeDS2HeaderTextView) m4n.d(this, R.id.czv_header);
            if (threeDS2HeaderTextView != null) {
                i = R.id.czv_info;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) m4n.d(this, R.id.czv_info);
                if (threeDS2TextView != null) {
                    i = R.id.czv_info_label;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) m4n.d(this, R.id.czv_info_label);
                    if (threeDS2TextView2 != null) {
                        i = R.id.czv_resend_button;
                        ThreeDS2Button threeDS2Button = (ThreeDS2Button) m4n.d(this, R.id.czv_resend_button);
                        if (threeDS2Button != null) {
                            i = R.id.czv_submit_button;
                            ThreeDS2Button threeDS2Button2 = (ThreeDS2Button) m4n.d(this, R.id.czv_submit_button);
                            if (threeDS2Button2 != null) {
                                i = R.id.czv_whitelist_no_button;
                                RadioButton radioButton = (RadioButton) m4n.d(this, R.id.czv_whitelist_no_button);
                                if (radioButton != null) {
                                    i = R.id.czv_whitelist_radio_group;
                                    RadioGroup radioGroup = (RadioGroup) m4n.d(this, R.id.czv_whitelist_radio_group);
                                    if (radioGroup != null) {
                                        i = R.id.czv_whitelist_yes_button;
                                        RadioButton radioButton2 = (RadioButton) m4n.d(this, R.id.czv_whitelist_yes_button);
                                        if (radioButton2 != null) {
                                            i = R.id.czv_whitelisting_label;
                                            ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) m4n.d(this, R.id.czv_whitelisting_label);
                                            if (threeDS2TextView3 != null) {
                                                this.infoHeader = threeDS2HeaderTextView;
                                                this.infoTextView = threeDS2TextView;
                                                this.infoLabelView = threeDS2TextView2;
                                                this.submitButton = threeDS2Button2;
                                                this.resendButton = threeDS2Button;
                                                this.whitelistingLabel = threeDS2TextView3;
                                                this.whitelistRadioGroup = radioGroup;
                                                this.challengeEntryView = frameLayout;
                                                this.whitelistYesRadioButton = radioButton2;
                                                this.whitelistNoRadioButton = radioButton;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void a(String str, h8i h8iVar) {
        ThreeDS2TextView threeDS2TextView = this.infoTextView;
        if (str != null && !StringsKt.T(str)) {
            threeDS2TextView.d(str, h8iVar);
        } else {
            threeDS2TextView.setVisibility(8);
        }
    }

    public final void b(String str, mr1 mr1Var) {
        ThreeDS2Button threeDS2Button = this.submitButton;
        if (str != null && !StringsKt.T(str)) {
            threeDS2Button.setText(str);
            threeDS2Button.setButtonCustomization(mr1Var);
        } else {
            threeDS2Button.setVisibility(8);
        }
    }

    /* renamed from: getChallengeEntryView$3ds2sdk_release, reason: from getter */
    public final FrameLayout getChallengeEntryView() {
        return this.challengeEntryView;
    }

    /* renamed from: getInfoHeader$3ds2sdk_release, reason: from getter */
    public final ThreeDS2HeaderTextView getInfoHeader() {
        return this.infoHeader;
    }

    /* renamed from: getInfoLabelView$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoLabelView() {
        return this.infoLabelView;
    }

    /* renamed from: getInfoTextView$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoTextView() {
        return this.infoTextView;
    }

    /* renamed from: getResendButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getResendButton() {
        return this.resendButton;
    }

    /* renamed from: getSubmitButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: getWhitelistNoRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistNoRadioButton() {
        return this.whitelistNoRadioButton;
    }

    /* renamed from: getWhitelistRadioGroup$3ds2sdk_release, reason: from getter */
    public final RadioGroup getWhitelistRadioGroup() {
        return this.whitelistRadioGroup;
    }

    /* renamed from: getWhitelistYesRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistYesRadioButton() {
        return this.whitelistYesRadioButton;
    }

    /* renamed from: getWhitelistingLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhitelistingLabel() {
        return this.whitelistingLabel;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        if (this.whitelistRadioGroup.getCheckedRadioButtonId() == R.id.czv_whitelist_yes_button) {
            return true;
        }
        return false;
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        challengeEntryView.getClass();
        this.challengeEntryView.addView(challengeEntryView);
    }

    public final void setInfoTextIndicator(int indicatorResId) {
        this.infoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(indicatorResId, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener listener) {
        this.resendButton.setOnClickListener(listener);
    }

    public final void setSubmitButtonClickListener(View.OnClickListener listener) {
        this.submitButton.setOnClickListener(listener);
    }

    public final void setWhitelistChecked(boolean checked) {
        this.whitelistYesRadioButton.setChecked(checked);
        this.whitelistNoRadioButton.setChecked(!checked);
    }
}
