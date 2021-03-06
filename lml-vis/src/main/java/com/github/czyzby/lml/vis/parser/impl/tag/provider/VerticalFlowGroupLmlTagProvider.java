package com.github.czyzby.lml.vis.parser.impl.tag.provider;

import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.parser.tag.LmlTagProvider;
import com.github.czyzby.lml.vis.parser.impl.tag.VerticalFlowGroupLmlTag;

/** Provides vertical flow group tags.
 *
 * @author MJ */
public class VerticalFlowGroupLmlTagProvider implements LmlTagProvider {
    @Override
    public LmlTag create(final LmlParser parser, final LmlTag parentTag, final StringBuilder rawTagData) {
        return new VerticalFlowGroupLmlTag(parser, parentTag, rawTagData);
    }
}
