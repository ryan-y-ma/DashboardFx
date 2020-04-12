/*
 * Copyright (C) Gleidson Neves da Silveira
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gn.global.factory.badges;

import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;


/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  21/11/2018
 * Version 1.0
 */
public class BadgeCellNotification extends GridPane {

    private final Label   title = new Label();
    private final SVGPath icon  = new SVGPath();

    public BadgeCellNotification(String svgPath, String text,  String styleClass){
        this.title.setText(text);
        icon.setContent(svgPath);
        icon.getStyleClass().add(styleClass);
        config();
    }

    private void config(){
        this.getStyleClass().add("badge-cell");

        this.add(icon, 0,0);
        this.add(title, 1,0);

        this.icon.setScaleX(1.2);
        this.icon.setScaleY(1.2);

        this.setHgap(10D);

    }
}
