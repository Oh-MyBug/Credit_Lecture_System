INSERT INTO admin(NAME, PASSWORD) VALUE('admin', 'admin');

INSERT INTO `lecture_location`(`location`) VALUES('汇星楼');

SELECT `id`, 'type' FROM ``lecture``;

SELECT `id`,`lecture_title`, `lecture_type`, `lecture_status`, `lecture_speaker`,
                `lecture_location`, `lecture_time`, `speaker_introduction`, `lecture_content`, `yingshu1`,
                `yingshu2`, `yingshu3`, `yingshu4`, `tongji1`, `tongji2`, `tongji3`, `tongji4`,`xinji1`, `xinji2`,
                `xinji3`, `xinji4`, `shuji1`, `shuji2`, `shuji3`, `shuji4`, `shujin1`, `shujin2`, `shujin3`,
                `shujin4`, `shushi1`, `shushi2`, `shushi3`, `shushi4` fro`lecture_location``lecture``lecture_location`m `lecture` WHERE id = 1;
                
SELECT `id`, `studentId`, `lectureId` FROM `reservation` WHERE `studentId` = 104 LIMIT 0, 5 ;