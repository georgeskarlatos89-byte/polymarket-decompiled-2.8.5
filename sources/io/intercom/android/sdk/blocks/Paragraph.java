package io.intercom.android.sdk.blocks;

import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ParagraphBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class Paragraph implements ParagraphBlock {
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    public Paragraph(StyleType styleType, Provider<AppConfig> provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ParagraphBlock
    public View addParagraph(Spanned spanned, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        ParagraphView paragraphView = new ParagraphView(viewGroup.getContext(), this.style, blockAlignment, this.appConfigProvider.get(), blockMetadata);
        if (StyleType.PREVIEW == this.style) {
            paragraphView.setText(spanned.toString());
        } else {
            paragraphView.setText(spanned);
        }
        BlockUtils.setLayoutMarginsAndGravity(paragraphView, blockAlignment.getGravity(), blockMetadata.isLastObject());
        AccessibilityUtils.INSTANCE.removeClickAbilityAnnouncement(paragraphView);
        return paragraphView;
    }
}
