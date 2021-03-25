import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class drawBike extends JComponent {
 public void paintComponent(Graphics g) {

  //Top Left Bike
  Graphics2D g2 = (Graphics2D) g;
  g2.setStroke(new BasicStroke(2.0f));
  GeneralPath bike1 = new GeneralPath();
  g2.setPaint(Color.GREEN);
  bike1.moveTo(303, 212);
  bike1.quadTo(289, 214, 260, 201);
  bike1.moveTo(260, 211);
  bike1.quadTo(296, 205, 260, 201);
  bike1.moveTo(289, 242);
  bike1.curveTo(262, 220, 276, 198, 289, 242);
  bike1.curveTo(296, 241, 294, 241, 281, 214);
  bike1.curveTo(295, 208, 300, 212, 302, 212);
  bike1.curveTo(302, 266, 330, 250, 292, 244);
  bike1.curveTo(282, 268, 273, 292, 257, 320);
  bike1.curveTo(287, 324, 309, 332, 314, 329);
  bike1.curveTo(328, 325, 353, 298, 389, 260);
  bike1.curveTo(399, 276, 402, 311, 417, 320);
  bike1.curveTo(413, 320, 399, 291, 384, 240);
  bike1.lineTo(384, 242);
  bike1.lineTo(291, 247);
  bike1.lineTo(293, 247);
  bike1.lineTo(317, 326);
  g2.draw(bike1);

  g2.setPaint(Color.MAGENTA);

  g2.draw(new CubicCurve2D.Double(383, 230, 430, 213, 428, 242, 411, 249));
  g2.draw(new Line2D.Double(380, 229, 382, 233));
  g2.draw(new Line2D.Double(419, 231, 393, 256));
  g2.draw(new QuadCurve2D.Double(404, 226, 403, 250, 390, 248));
  g2.draw(new QuadCurve2D.Double(398, 245, 398, 262, 400, 268));
  g2.draw(new CubicCurve2D.Double(421, 227, 420, 226, 430, 230, 434, 220));
  g2.draw(new CubicCurve2D.Double(402, 225, 418, 220, 432, 235, 410, 249));
  g2.draw(new CubicCurve2D.Double(427, 226, 438, 227, 427, 236, 433, 243));
  g2.draw(new CubicCurve2D.Double(433, 224, 432, 233, 437, 241, 437, 243));

  g2.draw(new Ellipse2D.Double(207, 270, 100, 102));
  g2.draw(new Ellipse2D.Double(212, 276, 90, 91));
  g2.draw(new Ellipse2D.Double(363, 272, 104, 101));
  g2.draw(new Ellipse2D.Double(368, 277, 93, 91));
  g2.draw(new Line2D.Double(257, 276, 255, 318));
  g2.draw(new Line2D.Double(250, 365, 255, 319));
  g2.draw(new Line2D.Double(260, 366, 255, 319));
  g2.draw(new Line2D.Double(266, 364, 265, 342));
  g2.draw(new Line2D.Double(276, 359, 253, 319));
  g2.draw(new Line2D.Double(283, 356, 258, 318));
  g2.draw(new Line2D.Double(289, 350, 258, 315));
  g2.draw(new Line2D.Double(294, 344, 258, 315));
  g2.draw(new Line2D.Double(297, 336, 262, 319));
  g2.draw(new Line2D.Double(300, 319, 258, 318));
  g2.draw(new Line2D.Double(299, 313, 213, 314));
  g2.draw(new Line2D.Double(211, 320, 257, 322));
  g2.draw(new Line2D.Double(213, 329, 258, 320));
  g2.draw(new Line2D.Double(216, 338, 258, 320));
  g2.draw(new Line2D.Double(220, 347, 259, 319));
  g2.draw(new Line2D.Double(226, 355, 260, 324));
  g2.draw(new Line2D.Double(240, 362, 259, 319));
  g2.draw(new Line2D.Double(233, 358, 263, 316));
  g2.draw(new Line2D.Double(297, 304, 260, 321));
  g2.draw(new Line2D.Double(293, 296, 258, 320));
  g2.draw(new Line2D.Double(286, 289, 258, 321));
  g2.draw(new Line2D.Double(266, 278, 262, 325));
  g2.draw(new Line2D.Double(248, 276, 257, 318));
  g2.draw(new Line2D.Double(241, 280, 259, 318));
  g2.draw(new Line2D.Double(231, 283, 258, 316));
  g2.draw(new Line2D.Double(225, 289, 255, 317));
  g2.draw(new Line2D.Double(220, 297, 259, 322));
  g2.draw(new Line2D.Double(214, 304, 257, 320));
  g2.draw(new Line2D.Double(412, 277, 412, 366));
  g2.draw(new Line2D.Double(421, 278, 420, 366));
  g2.draw(new Line2D.Double(437, 284, 417, 317));
  g2.draw(new Line2D.Double(430, 280, 418, 321));
  g2.draw(new Line2D.Double(445, 288, 415, 317));
  g2.draw(new Line2D.Double(451, 294, 417, 323));
  g2.draw(new Line2D.Double(456, 301, 387, 355));
  g2.draw(new Line2D.Double(457, 308, 417, 320));
  g2.draw(new Line2D.Double(460, 317, 421, 318));
  g2.draw(new Line2D.Double(457, 333, 414, 323));
  g2.draw(new Line2D.Double(461, 325, 418, 319));
  g2.draw(new Line2D.Double(456, 340, 414, 318));
  g2.draw(new Line2D.Double(451, 347, 415, 318));
  g2.draw(new Line2D.Double(445, 355, 413, 314));
  g2.draw(new Line2D.Double(436, 360, 416, 315));
  g2.draw(new Line2D.Double(403, 364, 414, 315));
  g2.draw(new Line2D.Double(395, 361, 416, 317));
  g2.draw(new Line2D.Double(380, 350, 418, 317));
  g2.draw(new Line2D.Double(375, 343, 409, 325));
  g2.draw(new Line2D.Double(370, 335, 416, 323));
  g2.draw(new Line2D.Double(368, 325, 419, 324));
  g2.draw(new Line2D.Double(370, 317, 415, 316));
  g2.draw(new Line2D.Double(372, 308, 414, 319));
  g2.draw(new Line2D.Double(375, 299, 417, 320));
  g2.draw(new Line2D.Double(380, 292, 416, 318));
  g2.draw(new Line2D.Double(387, 284, 416, 318));
  g2.draw(new Ellipse2D.Double(305, 314, 31, 35));
  g2.draw(new CubicCurve2D.Double(318, 322, 314, 304, 336, 321, 326, 325));
  g2.draw(new CubicCurve2D.Double(326, 324, 340, 325, 333, 339, 330, 337));
  g2.draw(new CubicCurve2D.Double(329, 337, 331, 346, 321, 350, 320, 343));
  g2.draw(new CubicCurve2D.Double(317, 342, 308, 346, 300, 336, 310, 333));
  g2.draw(new CubicCurve2D.Double(309, 331, 300, 337, 309, 297, 315, 321));
  g2.draw(new Ellipse2D.Double(317, 329, 6, 5));
  g2.draw(new Rectangle2D.Double(253, 329, 11, 7));
  g2.draw(new Rectangle2D.Double(258, 335, 6, 12));
  g2.draw(new Ellipse2D.Double(257, 339, 9, 8));
  g2.draw(new Ellipse2D.Double(250, 326, 8, 10));
  g2.draw(new Ellipse2D.Double(251, 326, 12, 8));
  g2.draw(new CubicCurve2D.Double(253, 332, 234, 336, 232, 317, 258, 319));
  g2.draw(new Line2D.Double(282, 267, 258, 319));
  g2.draw(new Line2D.Double(300, 328, 257, 318));
  g2.draw(new QuadCurve2D.Double(392, 269, 399, 294, 417, 321));
  g2.draw(new CubicCurve2D.Double(256, 312, 364, 302, 367, 363, 258, 346));
  g2.draw(new CubicCurve2D.Double(256, 312, 365, 291, 366, 373, 258, 346));
  g2.draw(new Line2D.Double(293, 328, 301, 330));
  g2.draw(new Line2D.Double(303, 246, 335, 245));
  g2.draw(new Line2D.Double(322, 246, 335, 247));
  g2.draw(new Line2D.Double(395, 276, 402, 296));
  g2.draw(new Line2D.Double(373, 275, 347, 303));
  g2.draw(new Line2D.Double(320, 331, 330, 354));
  g2.draw(new Line2D.Double(320, 331, 330, 354));
  g2.draw(new Ellipse2D.Double(328, 354, 6, 8));
  g2.draw(new Ellipse2D.Double(330, 357, 4, 4));
  g2.draw(new QuadCurve2D.Double(294, 211, 287, 220, 283, 217));
  g2.draw(new QuadCurve2D.Double(262, 212, 287, 220, 280, 222));
  g2.draw(new Line2D.Double(278, 214, 288, 233));



  // Bottom Right Bike
  g2.setPaint(Color.BLACK);
  GeneralPath bike2 = new GeneralPath();
  bike2.moveTo(703, 412);
  bike2.quadTo(689, 414, 660, 401);
  bike2.moveTo(660, 411);
  bike2.quadTo(696, 405, 660, 401);
  bike2.moveTo(689, 442);
  bike2.curveTo(662, 420, 676, 498, 689, 442);
  bike2.curveTo(696, 441, 694, 441, 681, 414);
  bike2.curveTo(695, 408, 700, 412, 702, 412);
  bike2.curveTo(702, 466, 730, 450, 692, 444);
  bike2.curveTo(682, 468, 673, 492, 657, 520);
  bike2.curveTo(687, 524, 709, 532, 714, 529);
  bike2.curveTo(728, 525, 753, 498, 789, 460);
  bike2.curveTo(799, 476, 802, 511, 817, 520);
  bike2.curveTo(813, 520, 799, 491, 784, 440);
  bike2.lineTo(784, 442);
  bike2.lineTo(691, 447);
  bike2.lineTo(693, 447);
  bike2.lineTo(717, 526);
  g2.draw(bike2);
  bike2.closePath();

  g2.setPaint(Color.CYAN);
  g2.draw(new CubicCurve2D.Double(783, 430, 830, 413, 828, 442, 811, 449));
  g2.draw(new Line2D.Double(780, 429, 782, 433));
  g2.draw(new Line2D.Double(819, 431, 793, 456));
  g2.draw(new QuadCurve2D.Double(804, 426, 803, 450, 790, 448));
  g2.draw(new QuadCurve2D.Double(798, 445, 798, 462, 800, 468));
  g2.draw(new CubicCurve2D.Double(821, 427, 820, 426, 830, 430, 834, 420));
  g2.draw(new CubicCurve2D.Double(802, 425, 818, 420, 832, 435, 810, 449));
  g2.draw(new CubicCurve2D.Double(827, 426, 838, 427, 827, 436, 833, 443));
  g2.draw(new CubicCurve2D.Double(833, 424, 832, 433, 837, 441, 837, 443));
  g2.draw(new Ellipse2D.Double(607, 470, 100, 102));
  g2.draw(new Ellipse2D.Double(612, 476, 90, 91));
  g2.draw(new Ellipse2D.Double(763, 472, 104, 101));
  g2.draw(new Ellipse2D.Double(768, 477, 93, 91));

  g2.draw(new Line2D.Double(657, 476, 655, 518));
  g2.draw(new Line2D.Double(650, 565, 655, 519));
  g2.draw(new Line2D.Double(660, 566, 655, 519));
  g2.draw(new Line2D.Double(666, 564, 665, 542));
  g2.draw(new Line2D.Double(676, 559, 653, 519));
  g2.draw(new Line2D.Double(683, 556, 658, 518));
  g2.draw(new Line2D.Double(689, 550, 658, 515));
  g2.draw(new Line2D.Double(694, 544, 658, 515));
  g2.draw(new Line2D.Double(697, 536, 662, 519));
  g2.draw(new Line2D.Double(700, 519, 658, 518));
  g2.draw(new Line2D.Double(699, 513, 613, 514));
  g2.draw(new Line2D.Double(611, 520, 657, 522));
  g2.draw(new Line2D.Double(613, 529, 658, 520));
  g2.draw(new Line2D.Double(616, 538, 658, 520));
  g2.draw(new Line2D.Double(620, 547, 659, 519));
  g2.draw(new Line2D.Double(626, 555, 660, 524));
  g2.draw(new Line2D.Double(640, 562, 659, 519));
  g2.draw(new Line2D.Double(633, 558, 663, 516));
  g2.draw(new Line2D.Double(697, 504, 660, 521));
  g2.draw(new Line2D.Double(693, 496, 658, 520));
  g2.draw(new Line2D.Double(686, 489, 658, 521));
  g2.draw(new Line2D.Double(666, 478, 662, 525));
  g2.draw(new Line2D.Double(648, 476, 657, 518));
  g2.draw(new Line2D.Double(641, 480, 659, 518));
  g2.draw(new Line2D.Double(631, 483, 658, 516));
  g2.draw(new Line2D.Double(625, 489, 655, 517));
  g2.draw(new Line2D.Double(620, 497, 659, 522));
  g2.draw(new Line2D.Double(614, 504, 657, 520));
  g2.draw(new Line2D.Double(812, 477, 812, 566));
  g2.draw(new Line2D.Double(821, 478, 820, 566));
  g2.draw(new Line2D.Double(837, 484, 817, 517));
  g2.draw(new Line2D.Double(830, 480, 818, 521));
  g2.draw(new Line2D.Double(845, 488, 815, 517));
  g2.draw(new Line2D.Double(851, 494, 817, 523));
  g2.draw(new Line2D.Double(856, 501, 787, 555));
  g2.draw(new Line2D.Double(857, 508, 817, 520));
  g2.draw(new Line2D.Double(860, 517, 821, 518));
  g2.draw(new Line2D.Double(857, 533, 814, 523));
  g2.draw(new Line2D.Double(861, 525, 818, 519));
  g2.draw(new Line2D.Double(856, 540, 814, 518));
  g2.draw(new Line2D.Double(851, 547, 815, 518));
  g2.draw(new Line2D.Double(845, 555, 813, 514));
  g2.draw(new Line2D.Double(836, 560, 816, 515));
  g2.draw(new Line2D.Double(803, 564, 814, 515));
  g2.draw(new Line2D.Double(795, 561, 816, 517));
  g2.draw(new Line2D.Double(780, 550, 818, 517));
  g2.draw(new Line2D.Double(775, 543, 809, 525));
  g2.draw(new Line2D.Double(770, 535, 816, 523));
  g2.draw(new Line2D.Double(768, 525, 819, 524));
  g2.draw(new Line2D.Double(770, 517, 815, 516));
  g2.draw(new Line2D.Double(772, 508, 814, 519));
  g2.draw(new Line2D.Double(775, 499, 817, 520));
  g2.draw(new Line2D.Double(780, 492, 816, 518));
  g2.draw(new Line2D.Double(787, 484, 816, 518));

  g2.draw(new Ellipse2D.Double(705, 514, 31, 35));
  g2.draw(new CubicCurve2D.Double(718, 522, 714, 504, 736, 521, 726, 525));
  g2.draw(new CubicCurve2D.Double(726, 524, 740, 525, 733, 539, 730, 537));
  g2.draw(new CubicCurve2D.Double(729, 537, 731, 546, 721, 550, 720, 543));
  g2.draw(new CubicCurve2D.Double(717, 542, 708, 546, 700, 536, 710, 533));
  g2.draw(new CubicCurve2D.Double(709, 531, 700, 537, 709, 497, 715, 521));
  g2.draw(new Ellipse2D.Double(717, 529, 6, 5));
  g2.draw(new Rectangle2D.Double(653, 529, 11, 7));
  g2.draw(new Rectangle2D.Double(658, 535, 6, 12));
  g2.draw(new Ellipse2D.Double(657, 539, 9, 8));
  g2.draw(new Ellipse2D.Double(650, 526, 8, 10));
  g2.draw(new Ellipse2D.Double(651, 526, 12, 8));
  g2.draw(new CubicCurve2D.Double(653, 532, 634, 536, 632, 517, 658, 519));
  g2.draw(new Line2D.Double(682, 467, 658, 519));
  g2.draw(new Line2D.Double(700, 528, 657, 518));
  g2.draw(new QuadCurve2D.Double(792, 469, 799, 494, 817, 521));
  g2.draw(new CubicCurve2D.Double(656, 512, 764, 502, 767, 563, 658, 546));
  g2.draw(new CubicCurve2D.Double(656, 512, 765, 491, 766, 573, 658, 546));
  g2.draw(new Line2D.Double(693, 528, 701, 530));
  g2.draw(new Line2D.Double(703, 446, 735, 445));
  g2.draw(new Line2D.Double(722, 446, 735, 447));
  g2.draw(new Line2D.Double(795, 476, 802, 496));
  g2.draw(new Line2D.Double(773, 475, 747, 503));
  g2.draw(new Line2D.Double(720, 531, 730, 554));
  g2.draw(new Line2D.Double(720, 531, 730, 554));
  g2.draw(new Ellipse2D.Double(728, 554, 6, 8));
  g2.draw(new Ellipse2D.Double(730, 557, 4, 4));
  g2.draw(new QuadCurve2D.Double(694, 411, 687, 420, 683, 417));
  g2.draw(new QuadCurve2D.Double(662, 412, 687, 420, 680, 422));
  g2.draw(new Line2D.Double(678, 414, 688, 433));

  // Top Right Bike
  g2.setPaint(Color.RED);
  g2.setStroke(new BasicStroke(5.0f));
  GeneralPath bike3 = new GeneralPath();
  bike3.moveTo(703, 212);
  bike3.moveTo(660, 211);
  bike3.moveTo(689, 242);
  bike3.curveTo(682, 268, 673, 292, 657, 320);
  bike3.curveTo(687, 324, 709, 332, 714, 329);
  bike3.curveTo(728, 325, 753, 298, 789, 260);
  bike3.curveTo(799, 276, 802, 311, 817, 320);
  bike3.curveTo(813, 320, 799, 291, 784, 240);
  bike3.lineTo(784, 242);
  bike3.lineTo(691, 247);
  bike3.lineTo(693, 247);
  bike3.lineTo(617, 326);
  g2.draw(bike3);
  bike3.closePath();

  g2.setPaint(Color.BLACK);
  g2.setStroke(new BasicStroke(4.0f));

  g2.draw(new CubicCurve2D.Double(783, 230, 830, 213, 828, 242, 811, 249));
  g2.draw(new Line2D.Double(780, 229, 782, 233));
  g2.draw(new Line2D.Double(819, 231, 793, 256));
  g2.draw(new Ellipse2D.Double(607, 270, 100, 102));
  g2.draw(new Ellipse2D.Double(612, 276, 90, 91));
  g2.draw(new Ellipse2D.Double(763, 272, 104, 101));
  g2.draw(new Ellipse2D.Double(768, 277, 93, 91));

  g2.setStroke(new BasicStroke(4.0f));
  g2.draw(new Line2D.Double(657, 276, 655, 318));
  g2.draw(new Line2D.Double(660, 366, 655, 319));
  g2.draw(new Line2D.Double(676, 359, 653, 319));
  g2.draw(new Line2D.Double(689, 350, 658, 315));
  g2.draw(new Line2D.Double(697, 336, 662, 319));
  g2.draw(new Line2D.Double(699, 313, 613, 314));
  g2.draw(new Line2D.Double(613, 329, 658, 320));
  g2.draw(new Line2D.Double(620, 347, 659, 319));
  g2.draw(new Line2D.Double(640, 362, 659, 319));
  g2.draw(new Line2D.Double(697, 304, 660, 321));
  g2.draw(new Line2D.Double(686, 289, 658, 321));
  g2.draw(new Line2D.Double(648, 276, 657, 318));
  g2.draw(new Line2D.Double(631, 283, 658, 316));
  g2.draw(new Line2D.Double(620, 297, 659, 322));
  g2.draw(new Line2D.Double(812, 277, 812, 366));
  g2.draw(new Line2D.Double(837, 284, 817, 317));
  g2.draw(new Line2D.Double(845, 288, 815, 317));
  g2.draw(new Line2D.Double(856, 301, 787, 355));
  g2.draw(new Line2D.Double(860, 317, 821, 318));
  g2.draw(new Line2D.Double(861, 325, 818, 319));
  g2.draw(new Line2D.Double(851, 347, 815, 318));
  g2.draw(new Line2D.Double(836, 360, 816, 315));
  g2.draw(new Line2D.Double(795, 361, 816, 317));
  g2.draw(new Line2D.Double(775, 343, 809, 325));
  g2.draw(new Line2D.Double(768, 325, 819, 324));
  g2.draw(new Line2D.Double(772, 308, 814, 319));
  g2.draw(new Line2D.Double(780, 292, 816, 318));

  g2.setStroke(new BasicStroke(2.0f));

  g2.draw(new Ellipse2D.Double(705, 314, 31, 35));
  g2.draw(new CubicCurve2D.Double(718, 322, 714, 304, 736, 321, 726, 325));
  g2.draw(new CubicCurve2D.Double(726, 324, 740, 325, 733, 339, 730, 337));
  g2.draw(new CubicCurve2D.Double(729, 337, 731, 346, 721, 350, 720, 343));
  g2.draw(new CubicCurve2D.Double(717, 342, 708, 346, 700, 336, 710, 333));
  g2.draw(new CubicCurve2D.Double(709, 331, 700, 337, 709, 297, 715, 321));
  g2.draw(new Ellipse2D.Double(717, 329, 6, 5));
  g2.draw(new Rectangle2D.Double(653, 329, 11, 7));
  g2.draw(new Rectangle2D.Double(658, 335, 6, 12));
  g2.draw(new Ellipse2D.Double(657, 339, 9, 8));
  g2.draw(new Ellipse2D.Double(650, 326, 8, 10));
  g2.draw(new Ellipse2D.Double(651, 326, 12, 8));
  g2.draw(new CubicCurve2D.Double(653, 332, 634, 336, 632, 317, 658, 319));
  g2.draw(new Line2D.Double(682, 267, 658, 319));
  g2.draw(new Line2D.Double(700, 328, 657, 318));
  g2.draw(new QuadCurve2D.Double(792, 269, 799, 294, 817, 321));
  g2.draw(new CubicCurve2D.Double(656, 312, 764, 302, 767, 363, 658, 346));
  g2.draw(new CubicCurve2D.Double(656, 312, 765, 291, 766, 373, 658, 346));
  g2.draw(new Line2D.Double(693, 328, 701, 330));
  g2.draw(new Line2D.Double(703, 246, 735, 245));
  g2.draw(new Line2D.Double(722, 246, 735, 247));
  g2.draw(new Line2D.Double(795, 276, 802, 296));
  g2.draw(new Line2D.Double(773, 275, 747, 303));
  g2.draw(new Line2D.Double(720, 331, 730, 354));
  g2.draw(new Line2D.Double(720, 331, 730, 354));
  g2.draw(new Ellipse2D.Double(728, 354, 6, 8));
  g2.draw(new Ellipse2D.Double(730, 357, 4, 4));
  g2.draw(new QuadCurve2D.Double(694, 211, 687, 220, 683, 217));
  g2.draw(new QuadCurve2D.Double(662, 212, 687, 220, 680, 222));
  g2.draw(new Line2D.Double(678, 214, 688, 233));


  // Bottom Left Bike
  g2.setPaint(Color.ORANGE);
  g2.setStroke(new BasicStroke(5.0f));

  GeneralPath bike4 = new GeneralPath();
  bike4.moveTo(303, 412);
  bike4.moveTo(260, 411);
  bike4.moveTo(289, 442);
  bike4.curveTo(282, 468, 273, 492, 257, 520);
  bike4.curveTo(287, 524, 309, 532, 314, 529);
  bike4.curveTo(328, 525, 353, 498, 389, 460);
  bike4.curveTo(399, 476, 402, 511, 417, 520);
  bike4.curveTo(413, 520, 399, 491, 384, 440);
  bike4.lineTo(384, 442);
  bike4.lineTo(291, 447);
  bike4.lineTo(293, 447);
  bike4.lineTo(217, 526);
  g2.draw(bike4);
  bike4.closePath();

  g2.setPaint(Color.BLACK);
  g2.setStroke(new BasicStroke(4.0f));
  g2.draw(new CubicCurve2D.Double(383, 430, 430, 413, 428, 442, 411, 449));
  g2.draw(new Line2D.Double(380, 429, 382, 433));
  g2.draw(new Line2D.Double(419, 431, 393, 456));
  g2.draw(new Ellipse2D.Double(207, 470, 100, 102));
  g2.draw(new Ellipse2D.Double(212, 476, 90, 91));
  g2.draw(new Ellipse2D.Double(363, 472, 104, 101));
  g2.draw(new Ellipse2D.Double(368, 477, 93, 91));
  g2.setStroke(new BasicStroke(4.0f));
  g2.draw(new Line2D.Double(257, 476, 255, 518));
  g2.draw(new Line2D.Double(260, 566, 255, 519));
  g2.draw(new Line2D.Double(276, 559, 253, 519));
  g2.draw(new Line2D.Double(289, 550, 258, 515));
  g2.draw(new Line2D.Double(297, 536, 262, 519));
  g2.draw(new Line2D.Double(299, 513, 213, 514));
  g2.draw(new Line2D.Double(213, 529, 258, 520));
  g2.draw(new Line2D.Double(220, 547, 259, 519));
  g2.draw(new Line2D.Double(240, 562, 259, 519));
  g2.draw(new Line2D.Double(297, 504, 260, 521));
  g2.draw(new Line2D.Double(286, 489, 258, 521));
  g2.draw(new Line2D.Double(248, 476, 257, 518));
  g2.draw(new Line2D.Double(231, 483, 258, 516));
  g2.draw(new Line2D.Double(220, 497, 259, 522));
  g2.draw(new Line2D.Double(412, 477, 412, 566));
  g2.draw(new Line2D.Double(437, 484, 417, 517));
  g2.draw(new Line2D.Double(445, 488, 415, 517));
  g2.draw(new Line2D.Double(456, 501, 387, 555));
  g2.draw(new Line2D.Double(460, 517, 421, 518));
  g2.draw(new Line2D.Double(461, 525, 418, 519));
  g2.draw(new Line2D.Double(451, 547, 415, 518));
  g2.draw(new Line2D.Double(436, 560, 416, 515));
  g2.draw(new Line2D.Double(395, 561, 416, 517));
  g2.draw(new Line2D.Double(375, 543, 409, 525));
  g2.draw(new Line2D.Double(368, 525, 419, 524));
  g2.draw(new Line2D.Double(372, 508, 414, 519));
  g2.draw(new Line2D.Double(380, 492, 416, 518));

  g2.setStroke(new BasicStroke(2.0f));
  g2.draw(new Ellipse2D.Double(305, 514, 31, 35));
  g2.draw(new CubicCurve2D.Double(318, 522, 314, 504, 336, 521, 326, 525));
  g2.draw(new CubicCurve2D.Double(326, 524, 340, 525, 333, 539, 330, 537));
  g2.draw(new CubicCurve2D.Double(329, 537, 331, 546, 321, 550, 320, 543));
  g2.draw(new CubicCurve2D.Double(317, 542, 308, 546, 300, 536, 310, 533));
  g2.draw(new CubicCurve2D.Double(309, 531, 300, 537, 309, 497, 315, 521));
  g2.draw(new Ellipse2D.Double(317, 529, 6, 5));
  g2.draw(new Rectangle2D.Double(253, 529, 11, 7));
  g2.draw(new Rectangle2D.Double(258, 535, 6, 12));
  g2.draw(new Ellipse2D.Double(257, 539, 9, 8));
  g2.draw(new Ellipse2D.Double(250, 526, 8, 10));
  g2.draw(new Ellipse2D.Double(251, 526, 12, 8));
  g2.draw(new CubicCurve2D.Double(253, 532, 234, 536, 232, 517, 258, 519));
  g2.draw(new Line2D.Double(282, 467, 258, 519));
  g2.draw(new Line2D.Double(300, 528, 257, 518));
  g2.draw(new QuadCurve2D.Double(392, 469, 399, 494, 417, 521));
  g2.draw(new CubicCurve2D.Double(256, 512, 364, 502, 367, 563, 258, 546));
  g2.draw(new CubicCurve2D.Double(256, 512, 365, 491, 366, 573, 258, 546));
  g2.draw(new Line2D.Double(293, 528, 301, 530));
  g2.draw(new Line2D.Double(303, 446, 335, 445));
  g2.draw(new Line2D.Double(322, 446, 335, 447));
  g2.draw(new Line2D.Double(395, 476, 402, 496));
  g2.draw(new Line2D.Double(373, 475, 347, 503));
  g2.draw(new Line2D.Double(320, 531, 330, 554));
  g2.draw(new Line2D.Double(320, 531, 330, 554));
  g2.draw(new Ellipse2D.Double(328, 554, 6, 8));
  g2.draw(new Ellipse2D.Double(330, 557, 4, 4));
  g2.draw(new QuadCurve2D.Double(294, 411, 287, 420, 283, 417));
  g2.draw(new QuadCurve2D.Double(262, 412, 287, 420, 280, 422));
  g2.draw(new Line2D.Double(278, 414, 288, 433));


  //MyNameIs?
  g2.setColor(Color.BLUE);
  g2.setFont(new Font("TimesRoman", Font.BOLD, 40));

  g2.drawString("Keyur Maru", 435, 400);
 }

}

public class maru_assignment5 {

 public static void main(String[] args) {
  JFrame frame = new JFrame();
  frame.setSize(1024, 768);
  frame.setTitle("4 Bikes");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  drawBike assemble = new drawBike();
  frame.add(assemble);

  frame.setVisible(true);
 }
}