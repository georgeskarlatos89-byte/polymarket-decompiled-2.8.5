package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class BlockFactory {
    private final TextSplittingStrategy textSplittingStrategy;

    public BlockFactory(TextSplittingStrategy textSplittingStrategy) {
        this.textSplittingStrategy = textSplittingStrategy;
    }

    public List<Block.Builder> getBlocksForText(String str) {
        List<String> apply = this.textSplittingStrategy.apply(str);
        int size = apply.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new Block.Builder().withType(BlockType.PARAGRAPH.name().toLowerCase()).withText(apply.get(i)));
        }
        return arrayList;
    }
}
